package IO.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
File类的常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("psfile");
        //获取文件名
        System.out.println(file.getName());
        //判读是否是一个目录
        System.out.println(file.isDirectory());
        //判断是否是一个文件
        System.out.println(file.isFile());
        //获取文件最后一次修改时间
        long haomiao = file.lastModified();   // 返回毫秒(从1970年到现在的总毫秒数)
        //总毫秒数转日期
        Date date = new Date(haomiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:hh:ss SSS");
        String strTime = sdf.format(date);
        System.out.println(strTime);
        //获取文件大小
        System.out.println(file.length());   //22字节
    }
}
