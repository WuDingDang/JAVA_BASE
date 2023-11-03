import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    关于 try..catch 中的 finally 子句：
        1. 在finally子句中的代码是最后执行的，并且一定会执行，即使try语句块中的代码出现异常
           finally 子句必须和try一起出现，不能单独编写
        2. finally
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        FileInputStream fis = null;     //声明位置放在try外面，在finally中才能使用
        try {
            //创建输入流对象
            fis = new FileInputStream("E:\\filetest1.txt");

            //一定会出现空指针异常
            String s = null;
            s.toString();
            System.out.println("hello world");

            //流使用完需要关闭，因为流是占用资源的
            //即使以上程序出现异常，流也必须关闭
            //放在这里流有可能关闭不了
           // fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("hello wdd");
            //流的关闭放在这比较保险
            if(fis != null){      //避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("hello kisty");

    }
}
