package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合的迭代
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();      //有序可重复
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add("5");
        c1.add(4);
        Iterator iterator = c1.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if(obj instanceof Integer){
                System.out.println(obj);
            }

        }
        System.out.println("=====================");
        Collection c2 = new HashSet();     //无序不重复
        c2.add(100);
        c2.add(100);
        c2.add(100);
        c2.add(50);
        c2.add(30);
        c2.add(140);
        c2.add(60);
        c2.add(8);
        Iterator iterator1 = c2.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
