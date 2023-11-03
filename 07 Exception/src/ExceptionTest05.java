import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    catch后面的小括号中的类型可以时具体的异常类型，也可以是该异常类型的父类型
    catch可以写多个，建议catch 的时候，精确的一个一个处理有利于程序的调试
    catch写多个时，从上到下必须是从小到大
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
           /*
        try {
            FileInputStream fis = new FileInputStream("E:\\filetest1.txt");
            System.out.println("这里不会执行");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }

            */

           /*
        try {
            FileInputStream fis = new FileInputStream("E:\\filetest1.txt");
            System.out.println("这里不会执行");
        } catch (IOException e) {         IOException e = new FileNotFoundException();
            System.out.println("文件不存在！");
        }

            */

           /*
           try{
                 FileInputStream fis = new FileInputStream("E:\\filetest1.txt");

                 System.out.println("这里不会执行");  
           }catch (Exception e){      //Exception e = new FileNotFoundException();
               System.out.println("文件不存在！");
           }

            */

           try{
                 FileInputStream fis = new FileInputStream("E:\\filetest1.txt");
                 fis.read();
               System.out.println(100/0);
           }catch (FileNotFoundException | ArithmeticException e){   //jdk8新特性
                 System.out.println("文件不存在！? 算数异常");
           }catch (IOException e){
               System.out.println("读文件报错");
           }



    }
}