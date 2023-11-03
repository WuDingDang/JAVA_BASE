public class ExceptionTest03 {
    /*
    //第一种处理方式：在方法声明的位置上继续使用throws，来完成异常的继续上抛，抛给调用者
    public static void main(String[] args) throws ClassNotFoundException{
        //main方法中调用doSome方法
        //因为doSome方法声明位置上有：throws ClassNotFoundException
        //在调用doSome方法时必须对这种异常进行预先处理
        //如果不处理，编译器就报错

        //
        doSome();

    }

     */

    //第二种处理方式：try..catch捕捉
    public static void main(String[] args) {
        try {
            doSome();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示在doSome() 方法在执行过程中，有可能会出现ClassNotFoundException异常
     * 叫做类没找到异常 。这个异常的直接父类是：Exception，所以ClassNotFoundException属于编译时异常
     * @throws ClassNotFoundException
     */

    public static void doSome() throws ClassNotFoundException{

    }
}
