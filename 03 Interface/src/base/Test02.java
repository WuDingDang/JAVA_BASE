package base;

public class Test02 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        Flyable a = new Bird();
        a.fly();
    }
}

class Animal{
    public Animal(){
        System.out.println("Animal无参构造");
    }
    public Animal(String s){
        System.out.println("Aniaml有参构造");
    }
}

interface Flyable{
    void fly();
}

class Bird extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
