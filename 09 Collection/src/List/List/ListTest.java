package List.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
List接口中常用方法
    1.List集合存储元素的特点：有序可重复
        有序：List集合中的元素有下标，从0开始
        可重复：存储一个1，可以再存储一个1
    2.List接口特有的常用方法
        void add(int index,E element)
        E get(int index)
        int indexOf(Object o)
        int lastIndexOf(Object o)
        E remove(int index)
        E set(int index,E element)
 */
public class ListTest {
    public static void main(String[] args) {
        //创建List类型的集合
        List list = new ArrayList();
        list.add("100");
        list.add("b");
        list.add(1,"k"); //使用不多，效率较低
        list.add("k");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //根据下标获取元素
        Object o = list.get(0);
        System.out.println(o);

        //因为有下标，所以List集合有特殊的遍历方式
        //通过下标遍历
        for(int i = 0 ; i < list.size();i ++){
            System.out.println(list.get(i));
        }
        //获取指定对象第一次出现处的索引
        System.out.println(list.indexOf("k"));
        //获取指定对象最后一次出现处的索引
        System.out.println(list.lastIndexOf("k"));

        System.out.println("==============");
        list.set(1,"oo");
        for(int i = 0 ; i < list.size();i ++){
            System.out.println(list.get(i));
        }

        //删除指定下标位置的元素
        list.remove(0);
        System.out.println(list.size());
    }
}
