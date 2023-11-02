package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        long start = System.currentTimeMillis();
        //日期转日期字符串
        //将日期类型Date，按照指定的格式进行转换：Date ---转换成具有一定格式的日期字符串--> String
        //SimpleDateFormat 是 java.text 包下的，负责日期格式化
        /*
        yyyy    年
        MM      月
        dd      日
        HH      时
        mm      分
        ss      秒
        SSS     毫秒
         */
        //获取系统当前日期(精确到毫秒)
        //直接调用无参构造方法
        Date nowTime = new Date();
        System.out.println(nowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formatNowTime = sdf.format(nowTime);
        System.out.println(formatNowTime);
        //日期字符串 转换成 Date类型
        String sdate = "2023-11-01 16:50:43";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(sdate);
        System.out.println(parse);
        /*
         获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数
         1s = 1000ms
        */
        long end = System.currentTimeMillis();
        System.out.println("start:"+start+",end:"+end);
        /*
    简单总结System类的相关属性和方法
        System.out      out是System类的静态变量
        System.out.println();       println()不是System类的，而是PrintStream类的方法
        System.gc();    建议启动垃圾回收器
        System.currentTimeMillis();         获取自1970年1月1日到系统当前时间的总毫秒数
        System.exit(0);         退出JVM
 */

    }
}
