package String;

public class StringTest03 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        //"hello"存储在方法区的字符串常量池中
        System.out.println(s1 == s2);    //true  内存地址一样
        String s3 = new String("xyz");
        String s4 = new String("xyz");
        System.out.println(s3 == s4);    //false
        //字符串之间的比较不能用“==”,应该调用String类的equals方法
        System.out.println(s3.equals(s4));   //true

        //i变量保存的是100这个值
        int i = 100;
        //str变量保存的是字符串对象的内存地址
        String str = "abc";

    }
}
