/*
1.SUN公司提供的JDK内置的异常肯定是不够用的，在实际开发中，
  有很多业务，这些业务出现异常之后，JDK中都是没有的，和业务挂钩的。
  异常类程序员可以自己定义

2.如何自定义异常
    第一步：编写一个类继承Exception 或 RuntimeException
    第二步：提供两个构造方法，一个无参，一个带有String参数的
 */
public class MyException extends Exception{   //编译时异常
        public MyException(){}

        public MyException(String s){
            super(s);
        }
}
