package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
一次最多读取b.length个字节，减少硬盘和内存的交互，提高程序的执行效率
往byte[] 数组当中读
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("08-IO/src/IO/file/file1.txt");
            //开始读 采用byte数组，一次读取多个字节，最多读取 数组.length 个字节
            byte[] bytes = new byte[4];         //准备一个4个长度的byte数组，一次最多读取4个字节
            int readCount = fis.read(bytes);        //返回读取到的字节数,一个字节都没有读到就返回-1
            System.out.println(readCount);
            //将字节数组转为字符串，不能全都转成字符串，应该读取多少字节，转多少个
            System.out.println(new String(bytes,0,readCount));
            readCount = fis.read(bytes);
            System.out.println(new String(bytes,0,readCount));
            readCount = fis.read(bytes);
            System.out.println(new String(bytes,0,readCount));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
