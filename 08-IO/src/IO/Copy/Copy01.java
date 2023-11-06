package IO.Copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
FileInputStream+FileOutputStream 完成文件的拷贝
拷贝的过程是一边读，一边写
使用以上的字节流拷贝文件时，文件类型随意，万能（任何文件都能拷贝）
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流对象
            fis = new FileInputStream("10-IO/src/IO/Copy/copyfile");
            //创建一个输出流对象
            fos = new FileOutputStream("10-IO/cofile11");

            //核心：一边读，一边写
            byte[] bytes = new byte[1024 * 1024];     //1MB 一次最多拷贝1MB
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }

            //输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //一起try，其中一个出现异常，可能会影响另外一个流的关闭
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
