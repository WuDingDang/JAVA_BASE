package String;
//String 类的构造方法
/*
1.String s = new String("");
2.String s = "";
3.String s = new String(char数组);
4.String s = new String(char数组,起始下标,长度);
5.String s = new String(byte数组);
6.String s = new String(byte数组,起始下标,长度);
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = new String("hello world");
        System.out.println(s1);
        //将字符数组转为字符串
        byte[] bytes = {97,98,99};      //97:a  98:b  99:c
        String s2 = new String(bytes);
        //输出字符串对象时，输出的不是对象的内存地址，而是字符串本身
        System.out.println(s2);     // abc
        //String(字节数组，数组下标的起始位置，长度)
        //将byte数组中的一部分转换成字符串
        String s3 = new String(bytes,1,2);
        System.out.println(s3);   // bc

        //将char数组转为字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);
        //将char数组的一部分转为字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);
    }
}
