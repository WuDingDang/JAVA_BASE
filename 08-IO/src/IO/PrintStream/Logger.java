package IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
日志工具
 */
public class Logger {
    /*
    记录日志的方法
     */
    public static void log(String msg){
        try {
            //标准输出流指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("10-IO/src/IO/PrintStream/log.txt",true));
           //改变输出方向
            System.setOut(out);
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:hh:ss SSS");
            String format = sdf.format(nowTime);
            System.out.println(format+":"+msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
