import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出，谁调用这个方法，就抛给谁（抛给调用者处理）
 */

/*
    注意：只要异常没有捕捉，采用上抛的方式，此方法的后续代码不会执行
            try语句块中的某一行出现异常，该行后面的代码不会执行
            try..catch捕捉异常之后的代码可以执行
 */
public class ExceptionTest04 {
    //一般不在main方法上使用throws，因为这个异常如果发生了，一定会抛给JVM，JVM只有终止
    //异常处理机制的作用就是增强程序的健壮性，
    //一般main方法中的异常建议用try..catch捕捉
    public static void main(String[] args) {
        System.out.println("main begin");
        try{
            m1();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("main end");
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 end");
    }

    public static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 end");
    }

    public static void m3() throws FileNotFoundException {
        //创建一个输入流对象，该流指向一个文件
        /*
            1.调用构造方法FileInputStream(String name)
            2.这个构造方法的声明位置上有throws FileNotFoundException
            3.通过类的继承结构看到：FileNotFoundException的父类是IOException，IOException的父类是Exception
              最终得知FileNotFoundException是编译时异常
              编译时异常要求程序员编写程序阶段必须对他进行处理，不处理编译器就会报错（处理时抛父类也行）
         */

        new FileInputStream("E:\\filetest.txt");
    }
}
