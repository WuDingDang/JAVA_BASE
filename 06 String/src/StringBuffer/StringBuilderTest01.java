package StringBuffer;
/*
    StringBuffer 和 StringBuilder 的区别
    StringBuffer中的方法都有: synchronized 关键字修饰，表示StringBuffer在多线程环境下运行是安全的(线程安全的)
    StringBuilder没有(非线程安全的)
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("kitty");
    }
}
