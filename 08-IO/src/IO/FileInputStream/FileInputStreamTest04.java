package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其他常用方法
    int available():返回流当中剩余的没有读到的字节数量
    long skip(long n)：跳过几个字节不读
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("10-IO/temp1.txt");
            fis.skip(3);    //跳过3个字节
            //读一个字节
            int readData = fis.read();
            System.out.println(readData);
            //还剩下可以读的字节数量
            System.out.println(fis.available());

            byte[] bytes = new byte[fis.available()];    //不适合大文件，因为byte数组不能太大
            //不需要循环，读一次就行
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
