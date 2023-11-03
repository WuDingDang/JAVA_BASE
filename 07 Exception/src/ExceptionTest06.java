/*
  异常对象的两个非常重要的方法
    获取异常简单的描述信息:这个信息实际上就是构造方法上面String参数
         String msg = exception.getMessage();
    打印异常追踪的堆栈信息:采用异步线程的方式打印
    异常追踪信息从上往下看，SUN写的代码不用看
         exception.printStackTrace();
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        String msg = e.getMessage();
        System.out.println(msg);
        e.printStackTrace();
        System.out.println("hello");
    }
}
