package IO.File;

import java.io.File;
import java.io.IOException;

/*
File:
1.File类和四大家族没有关系，所以File类不能完成文件的读和写
2.File对象代表：文件和目录路径名的抽象表示形式
    eg.  E:\javawork\idea_work\10-IO 是一个File对象
         E:\javawork\idea_work\10-IO\temp1.txt 是一个File对象
3.File类的常用方法
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
        //创建一个File对象
        File file = new File("D:\\file");
        //判断文件是否存在
        System.out.println(file.exists());
        //如果D:\file不存在，则以文件的形式创建出来

        if(!file.exists()){
            //以文件形式创建
            file.createNewFile();
        }

        //如果D:\file不存在，则以文目录的形式创建出来
        if(!file.exists()){
            file.mkdir();
        }
        File file2 = new File("D:/a/b/c/d");
        System.out.println(file2.exists());
        if(!file2.exists()){
            //以多重目录形式新建
            file2.mkdirs();
        }

        File file3 = new File("E:\\javawork\\idea_work\\10-IO\\src\\IO\\File\\Test1\\testfile");
        //获取文件的父路径
        String parentPath = file3.getParent();
        System.out.println(parentPath);
        File parentFile = file3.getParentFile();
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());

        File file4 = new File("psfile");
        System.out.println("绝对路径:" + file4.getAbsolutePath());

    }
}
