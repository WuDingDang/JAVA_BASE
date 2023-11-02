public class FinalTest01 {
    public static void main(String[] args){
        A a = new B();
        a.doSome();       //B dosome ...

        if(a instanceof B){
            B b1 = (B)a;
            b1.doOther();
            b1.doSome();
        }
    }
}

class A{
    public void doSome(){
        System.out.println("A dosome ...");
    }
}

class B extends A{
    public void doSome(){
        System.out.println("B dosome ...");
    }
    public void doOther(){
        System.out.println("B doOther...");
    }
}
