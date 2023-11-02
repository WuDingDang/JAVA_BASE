package Integer;

public class IntegerTest02 {
    public static void main(String[] args) {
        //重点
        Integer integer = Integer.valueOf(100);  //int -> Integer
        Integer integer1 = Integer.valueOf("123");  //String ->Integer
        int i = Integer.parseInt("222");  //String->int


        //----------------------了解-------------------------------------------
        // static String toBinaryString(int i)       //将十进制转为二进制字符串
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);    //"11"

        // static String toHexString(int i)       //将十进制转为十六进制字符串
        //十六进制   1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        String hexString = Integer.toHexString(26);
        System.out.println(hexString);

        // static String toOctalString(int i)       //将十进制转为八进制字符串
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);

    }
}
