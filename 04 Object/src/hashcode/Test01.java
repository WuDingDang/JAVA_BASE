package hashcode;

public class Test01 {
    public static void main(String[] args) {
        Object o = new Object();
        int i = o.hashCode();
        System.out.println(i);     // //一串数字 等同于对象的地址
    }
}
