/*
final修饰的引用只能指向一个对象,但是对象里的数据可以改变
 */
public class FinalTest02 {
    public static void main(String[] args){
        final Person p = new Person(20);
       // p = new Person(20);  //报错
        p.age = 30;
    }
}

class Person{
    int age;
    public Person(){}
    public Person(int age){
        this.age = age;
    }
}
