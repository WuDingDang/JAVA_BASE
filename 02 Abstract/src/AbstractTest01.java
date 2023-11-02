public class AbstractTest01 {
    public static void main(String[] args) {
        CreditAccount ca  = new CreditAccount("pp");
        ca.doSome();
        ca.doOther();
    }
}

abstract class Account{
    public Account(){
        System.out.println("Account 无参构造函数");
    }
    public Account(String s){
        System.out.println("Account 有参构造函数");
    }
    public abstract void doSome();
    public void doOther(){
        System.out.println("Account doother");
    }
}

class CreditAccount extends Account{
    public CreditAccount(String s){
        super();
        System.out.println("CreditAccount 有参构造函数");
    }

    @Override
    public void doSome() {
        System.out.println("CreditAccount dosome");
    }
}
