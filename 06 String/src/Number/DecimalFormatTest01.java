package Number;

import java.text.DecimalFormat;

/*
    关于数字的格式化（了解）
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat 负责数字格式化
        /*
            数字格式化有哪些？？
                #   任意数字
                ,   千分位
                .   小数点
                0   不够时补0

             ###,###.##    表示：加入千分位，保留两位小数
         */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56678);
        System.out.println(s);

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(12345.43);
        System.out.println(s2);
    }
}
