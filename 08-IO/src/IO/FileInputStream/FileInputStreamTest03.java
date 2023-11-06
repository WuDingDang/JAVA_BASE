package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
最终版
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("08-IO/src/IO/file/file1.txt");
            //开始读 采用byte数组，一次读取多个字节，最多读取 数组.length 个字节
            byte[] bytes = new byte[4];         //准备一个4个长度的byte数组，一次最多读取4个字节
             /*
            while(true){
                int readCount = fis.read(bytes);
                if(readCount == -1){
                    break;
                }
                //把byte数组转成字符串，读到多少个，转成多少个
                System.out.println(new String(bytes,0,readCount));
            }

             */
            //改进
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,readCount));
            }
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
