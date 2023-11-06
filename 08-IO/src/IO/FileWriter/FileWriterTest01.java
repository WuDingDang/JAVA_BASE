package IO.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:文件字符输出流，只能输出普通文本
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            //创建文件字符输出流对象
           // out = new FileWriter("file");
            out = new FileWriter("file",true);
            char[] chars = {'我','是','中','国','人'};
            out.write(chars,2,3);
            out.write("\n");    //换行
            out.write("我的名字是吴叮当");


            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
