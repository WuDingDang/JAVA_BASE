package base;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(A.PI);
        System.out.println(A.PO);
        D d = new D();
        System.out.println(d.sum(3,5));
        A a = new D();
        a.sum(1,3);
        B b = new D();
        b.sub(4,3);
    }
}

interface A{
    public static final double PI = 3.159;
    int PO= 2;
    int sum(int a,int b);
}

interface B{
    int sub(int a,int b);
}

interface C extends A,B{

}

class D implements A ,B{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
