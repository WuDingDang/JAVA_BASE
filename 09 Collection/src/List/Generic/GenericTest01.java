package List.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK5后 泛型
泛型只在程序编译阶段起作用给编译器参考（运行阶段泛型没用）
使用泛型的好处：
    1.集合中存储的元素统一
    2.从集合中去除的元素类型是泛型指定的类型，不需要进行大量的向下转型
泛型的缺点：
    导致集合中的元素缺乏多样性
 */
public class GenericTest01 {
    public static void main(String[] args) {
        //不使用泛型机制，分析程序存在缺点
        List list = new ArrayList();
        Cat c = new Cat();
        Bird b = new Bird();
        list.add(c);
        list.add(b);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            //Animal a = it.next();   //错误
            //通过迭代器取出的是Object
            Object object = iterator.next();
            //Object中没有move方法，无法调用，需要向下转型
            if(object instanceof Animal){
                Animal a = (Animal) object;
                a.move();
            }
        }


        //使用泛型
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
        //用泛型来指定集合中存储的数据类型
        List<Animal> list1 = new ArrayList<>();
        //指定List集合中只能存储Animal，那么存储String就会编译报错
        //使用泛型后，集合中元素的数据类型更加统一
        list1.add(c);
        list1.add(b);
        //表示迭代器迭代的是Animal类型
        Iterator<Animal> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            //使用泛型后，每次迭代返回的数据都是Animal类型
            Animal a = iterator1.next();
            //不需要进行强制类型转换
            a.move();
            //调用子类的方法需要向下转型
            if(a instanceof Cat){
                Cat cat = (Cat)a;
                cat.catchMouse();
            }
            if(a instanceof Bird){
                Bird bird = (Bird)a;
                bird.fly();
            }
        }

    }

}

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("Bird fly");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("Cat catchMouse");
    }
}
