/*
   final    finally     finalize  区别

 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        //final 是关键字 ， final修饰的变量不能重新赋值
        final int i = 200;
        //i = 100;   报错

        //finally 是关键字，和try联用，使用在异常处理机制
        //在finally语句块中的代码一定执行
        try{

        }finally {
            System.out.println("finally...");
        }

        //finalize() 是Object类中的一个方法，作为方法名出现
        //所以finalize 是标识符
        //finalize() 方法是JVM的GC垃圾回收器负责调用
    }
}
