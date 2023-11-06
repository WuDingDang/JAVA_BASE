package IO.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件字节输出流，负责写
内存-->硬盘
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            //myfile文件不存在时会自动新建
            //这种方式会将原文件清空，然后重新写入
            //fos = new FileOutputStream("myfile");
            //以追加的方式在文件末尾写入，不会清空原文件内容
            fos = new FileOutputStream("08-IO/src/IO/file/myfile",true);
            //开始写
            byte[] bytes = {97,98,99,100};
            //将byte数组全部写出
            fos.write(bytes);

            //将byte数组一部分写出
            fos.write(bytes,0,2);
            String s = "我是wdd!";
            byte[] bytes1 = s.getBytes();    //将字符串转为byte数组
            fos.write(bytes1);
            //写完之后，一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
