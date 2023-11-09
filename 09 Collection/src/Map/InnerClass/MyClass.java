package Map.InnerClass;



import java.util.HashSet;
import java.util.Set;

public class MyClass {
    //声明一个静态内部类
    private static class InnerCalss{
        //静态方法
        public static void m1(){
            System.out.println("m1...");
        }
        //实例方法
        public void m2(){
            System.out.println("m2...");
        }
    }

    public static void main(String[] args) {
        //类名叫MyClass.InnerClass
        MyClass.InnerCalss.m1();
        //创建静态内部类对象
        MyClass.InnerCalss mi = new MyClass.InnerCalss();
        mi.m2();

//        //Set集合中存储的对象是MyClass.InnerClass类型
//        Set<InnerClass> set = new HashSet<>();
//        Set<String> set2 = new HashSet<>();
    }
}
