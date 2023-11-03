public class ExceptionTest02 {
    public static void main(String[] args) {
        /*
            程序执行到此处发生了ArithmeticException异常，
            底层new了一个ArithmeticException异常对象，
            然后抛出了，由于是main方法调用了100/0，所以
            这个异常ArithmeticException抛给了main方法，
            main方法没有处理，将这个异常自动抛给了JVM，
            JVM最终终止程序的执行。

            ArithmeticException继承RunTimeException,属于运行时异常。
            在编写程序阶段不需要对这种异常进行预先的处理
         */
        System.out.println(100/0);
        //这里的hello world 没有输出，没有执行
        System.out.println("hello world");
    }
}
