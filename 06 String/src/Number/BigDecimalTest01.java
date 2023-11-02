package Number;

import java.math.BigDecimal;

/*
BigDecimal 属于大数据，精度极高，不属于基本数据类型,属于java对象（引用数据类型）

注意：财务软件中 double是不够用的
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        //精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        //求和
        // v1 + v2  //不能直接求和 v1 v2 是引用
        BigDecimal v3 = v1.add(v2);    //调用方法求和
        System.out.println(v3);  //300

        BigDecimal v4 = v2.divide(v1);
        System.out.println(v4);        //2


    }
}
