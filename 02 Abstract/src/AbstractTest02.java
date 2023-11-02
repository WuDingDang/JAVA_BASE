public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird();    //向上转型
        //a的类型是Animal，Animal是抽象的
        //面向抽象编程，降低程序耦合度，提高程序扩展力，符合OCP原则
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
    //需要将从父类中继承过来的抽象方法进行覆盖/重写或叫实现
    @Override
    public void move() {
        System.out.println("Bird fly");
    }
}
