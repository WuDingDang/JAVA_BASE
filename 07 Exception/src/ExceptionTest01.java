/*
java语言中异常是以什么形式存在？
    1.异常在java中以类的形式存在，每一个异常类都可以创建异常对象
    2.
 */

/*
    编译时异常和运行时异常的区别？
    编译时异常一般发生的概率比较高，运行时异常一般发生的概率比较低
    对于一些发生概率较高的异常，需要在运行之前对其进行预处理
 */
/*
    java语言中对异常的处理包括两种方式
    1.在方法声明的位置上，使用throws关键字，抛给上一级
    2.使用try..catch 进行异常的捕捉
 */

public class ExceptionTest01 {
    public static void main(String[] args) {
        //通过“异常类” 实例化 “异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);
        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);
    }
}
