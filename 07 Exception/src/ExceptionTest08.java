/*
finally语句
    try不能单独使用
    try finally 可以联用
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        /*
            以下代码执行顺序：
                先执行try..
                再执行finally...
                最后执行return（return语句只要执行，方法必然结束）
         */
        try{
            System.out.println("try...");
            return;
        }finally {
            System.out.println("finally...");

        }
        //System.out.println("hello kitty");    //无法执行到
    }
}
