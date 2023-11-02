public class FinalTest03 {
    public static void main(String[] args) {
        User u = new User();
    }
}
/*
final修饰的实例变量需要手动赋值（可以在构造器中初始化，也可以程序员手动赋值）
 */
class User{
    final int age = 11;
    final double height = 190;
    final double weight;
    public User(){
       // this.height = 170;    //报错
        this.weight = 110;
        System.out.println("age:"+age+",height:"+height+",weight:"+weight);
    }
}
