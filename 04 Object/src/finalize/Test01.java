package finalize;

public class Test01 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Person p = new Person();
            p = null;
            System.gc();
        }

    }
}

class Person{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("即将被销毁");
    }
}
