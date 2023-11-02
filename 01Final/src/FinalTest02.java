public class FinalTest02 {
    public static void main(String[] args){
        final Person p = new Person(20);
       // p = new Person(20);  //报错
    }
}

class Person{
    int age;
    public Person(){}
    public Person(int age){
        this.age = age;
    }
}
