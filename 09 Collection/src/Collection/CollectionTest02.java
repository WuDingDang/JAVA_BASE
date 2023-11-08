package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 ********关于集合遍历|迭代专题
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add(new Object());
        c.add(11122);
        //对集合进行遍历
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator iterator = c.iterator();
        //第二步：通过获取的迭代器对象开始迭代/遍历集合
        /*
        迭代器对象Iterator的方法：
            boolean hasNext()       如果仍有元素可以迭代，返回true
            Object next()           返回迭代的下一个元素
         */
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
