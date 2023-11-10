package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Customer> customers = new TreeSet<>();
        customers.add(new Customer(20));
        customers.add(new Customer(40));
        customers.add(new Customer(30));
        customers.add(new Customer(10));
        customers.add(new Customer(40));
        for(Customer c:customers){
            System.out.println(c);
        }
    }
}


//放在TreeSet集合中的元素需要实现java.lang.Comparable接口
//并且实现compareTo方法，equals可以不写
class Customer implements Comparable<Customer>{
    int age;
    public Customer(int age){
        this.age = age;
    }

    //需要在这个方法中编写比较的逻辑
    //k.compareTo(t.key)
    //拿着参数k和集合中每一个k做比较，返回值可能大于0，小于0，等于0
    @Override
    public int compareTo(Customer c) {   //c1.compareTo(c2)
        //this是c1
        //c是c2
        //c1和c2比较时，就是this和c比较
//        int age1 = this.age;
//        int age2 = c.age;
//        if(age1 == age2) return 0;
//        else if(age1 >age2) return 1;
//        else return -1;
        return this.age - c.age;
    }
    public String toString(){
        return "Customer[age="+age+"]";
    }
}
