package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，若还是用之前的迭代器，会出现异常 java.util.ConcurrentModificationException
    在迭代集合元素的过程中，不能调用集合对象的remove方法删除元素，会发生异常 java.util.ConcurrentModificationException
    在迭代元素的过程中，一定要使用迭代器Iterator的remove()方法删除元素
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        /*
        Collection c = new ArrayList();
        //注意：此时获取的迭代器，指向的是集合中没有元素状态下的迭代器
        //集合结构只要改变，迭代器必须重新获取,否则调用next()方法时，会发生java.util.ConcurrentModificationException
         Iterator iterator = c.iterator();
        c.add(1);
        c.add(3);
        c.add(2);
       // iterator = c.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

         */


        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");
        Iterator iterator1 = c2.iterator();
        while(iterator1.hasNext()){
            Object o = iterator1.next();
            //删除元素
            //删除元素之后，集合的结构发生变化，应该重新获取迭代器
            //但是循环下一次的时候并没有重新获取迭代器，所以会出现异常
            //出异常的根本原因：集合中元素删除了，但是没有更新迭代器
            //c2.remove(o);     //直接通过集合删除元素，没有通知迭代器（导致迭代器的快照和原集合的状态不同）
            //使用迭代器删除时，会自动更新迭代器，并且更新集合（删除集合元素）
            iterator1.remove();         //删除的是迭代器指向的当前元素
            System.out.println(o);
        }
        System.out.println(c2.size());

    }
}
