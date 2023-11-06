package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileInputStream:
    1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
    2.字节的方式，完成输入的操作完成读的操作（硬盘-->内存）

  int read()
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流对象
        FileInputStream fis = null;
        try {
            //相对路径 从当前所在位置作为起点开始找
            //IDEA默认的当前路径是工程Project的根
            fis = new FileInputStream("08-IO/src/IO/file/file1.txt");
            //开始读
            /*
            while(true) {     //返回读到的字节本身
                int  readData = fis.read();
                System.out.println(readData);
                if(readData == -1) break;
            }

             */
            //改造while循环
            //一次读取一个字节，内存和硬盘交互频繁，基本上时间和资源都耗费在交互上
            int readData = 0;
            while( (readData = fis.read()) != -1){
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //在finally语句块中确保流一定关闭
            //关闭流的前提是：流不是空
            if(fis != null){      //避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
