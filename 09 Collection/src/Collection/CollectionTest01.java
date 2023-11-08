package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法
    1.Collection能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型
        使用“泛型”之后，Collection中只能存储某个具体的类型
        （集合中不能直接存储基本数据类型，也不能存储java对象，只是存储java对象的内存地址）
    2.Collection中的常用方法
        boolean add(Object e)    向集合中添加元素
        int size()               获取集合中元素的个数
        void clear()             清空集合
        boolean contains(Object o)     判断当前集合中是否包含元素o
        boolean remove(Object o)         删除集合中某个元素
        boolean isEmpty()               判断集合是否为空
        Object[] toArray()              将集合转换为数组
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();       //接口是抽象的，无法实例化
        //多态
        Collection c = new ArrayList();
        //常用方法
        //1.add()  向集合中添加元素
        c.add(1300);   //自动装箱，实际上放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);
        //2.size()    获取集合中元素的个数
        System.out.println(c.size());
        //3.clear()  清空集合
        c.clear();
        System.out.println(c.size());
        c.add("hello");    //"hello"对象的内存地址放到集合中
        c.add("world");
        c.add("kitty");
        //4.contains()     判断当前集合中是否包含元素
        System.out.println(c.contains("hello"));
        System.out.println(c.contains("wdd"));
        System.out.println(c.size());
        //5.remove()      删除集合中某个元素
        c.remove("hello");
        System.out.println(c.size());
        //6.isEmpty()     判断集合是否为空
        System.out.println(c.isEmpty());
        c.clear();
        c.add("aaa");
        c.add("bbb");
        c.add(100);
        //7.toArray()    转换成数组
        Object[] objects = c.toArray();
        for(Object o: objects){
            System.out.println(o);
        }


    }
}

class Student{

}
