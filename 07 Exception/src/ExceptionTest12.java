public class ExceptionTest12 {
    public static void main(String[] args) {
        //创建异常对象（只new了异常，没有手动抛出）
        MyException m = new MyException("用户名不能为空");
        m.printStackTrace();
        System.out.println(m.getMessage());
    }
}
