package String;

/*
分析一下程序一共创建了几个对象
 */
public class StringTest04 {
    public static void main(String[] args) {
        /*
        一共三个对象
        方法区中字符串常量池中有一个hello对象
        堆内存中有两个String对象
         */
        String s1 = new String("hello");
        String s2 = new String("hello");

    }
}
