package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        long start = System.currentTimeMillis();
        //日期转日期字符串
        Date nowTime = new Date();
        System.out.println(nowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formatNowTime = sdf.format(nowTime);
        System.out.println(formatNowTime);

        String sdate = "2023-11-01 16:50:43";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(sdate);
        System.out.println(parse);

        long end = System.currentTimeMillis();
        System.out.println("start:"+start+",end:"+end);

    }
}
