package List.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8后引入：自动类型推断机制（钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>(); 前提是JDK8之后
        List<Animal> list = new ArrayList<>();
        list.add(new Animal());
        list.add(new Cat());
        list.add(new Bird());
        Iterator<Animal> iterator = list.iterator();
        while(iterator.hasNext()){
            Animal a = iterator.next();
            a.move();
        }

        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
