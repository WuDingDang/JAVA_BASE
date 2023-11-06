package IO.Copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
FileReader + FileWriter 进行拷贝，只能拷贝普通文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("file");
            out = new FileWriter("10-IO/src/IO/Copy/copyfileRW");
            int readCount = 0;
            char[] chars = new char[1024 * 512];    //1MB
            while ( (readCount = in.read(chars)) != -1){
                out.write(chars,0,readCount);
            }


            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
