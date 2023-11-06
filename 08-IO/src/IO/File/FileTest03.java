package IO.File;

import java.io.File;

/*
File类中的listFiles方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下所有子文件
        File file = new File("E:\\javawork\\idea_work\\10-IO\\src\\IO");
        File[] files = file.listFiles();
        for(File f :files){
            System.out.println(f.getAbsolutePath());
        }
    }
}
