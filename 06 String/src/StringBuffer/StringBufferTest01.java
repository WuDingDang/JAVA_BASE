package StringBuffer;
/*
    在实际开发中，如果需要对字符串进行频繁拼接，会有什么问题？
    因为java中的字符串是不可变的，每一次拼接都会产生新的字符串，
    这样会占用大量的方法区内存，造成内存空间的浪费
        String s = "abc";
        s += "hello";
        就以上的两行代码，就导致在方法区字符串常量池中创建了3个对象: "abc" "hello" "abchello"

    String类为什么不可变？？？
        源代码中，String类有一个byte数组，这个byte数组是使用final修饰的
        因为数组一旦创建，长度不可变，并且被final修饰的引用，一旦指向某个对象之后，不可再指向其他对象，所以不可变

    StringBuffer/StringBuilder 为什么可变？？？
        源代码 StringBuffer/StringBuilder内部实际上是一个byte数组，这个数组没有被final修饰
        StringBuffer/StringBuilder的初始化容量是16，当存满之后会进行扩容，底层调用数组拷贝的方法System.arraycopy()进行扩容
        所以适用于字符串的频繁拼接
 */
/*
    如果需要进行大量字符串的拼接操作，建议使用JDK中自带的：
        java.lang.StringBuffer
        java.lang.StringBuilder
 */

/*
    如何优化StringBuffer性能？
        在创建StringBuffer时，尽可能给定一个初始化容量，
        最好减少底层数组的扩容次数，预估计
        关键点：给一个合适的初始黄容量，可以提高程序的执行效率
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        //StringBuffer底层实际上是byte数组，往StringBuffer中放字符串，实际上是放到byte数组中，StringBuffer的初始化容量是16
        StringBuffer stringBuffer = new StringBuffer();
        //append()方法在底层追加时，如果byte数组满了，会自动扩容
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("d");


        //给定一个初始化容量的StringBuffer对象（字符串缓冲区对象）
        StringBuffer sb = new StringBuffer(100);
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);

    }
}
