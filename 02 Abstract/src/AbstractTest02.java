public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.move();
        if(a instanceof Bird){
            Bird b = (Bird)a;
            b.eat();
        }
    }
}

abstract class Animal{
    public abstract void move();
}

class Bird extends Animal{
    public void eat(){
        System.out.println("bird eat chong");
    }

    @Override
    public void move() {
        System.out.println("Bird fly");
    }
}
