package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1.默认初始化容量10
    2.集合底层是一个Object[]数组
    3.构造方法：
            List list1 = new ArrayList();
            List list2 = new ArrayList(20);
    4.ArrayList集合底层是数组，怎么优化？
        尽可能少的扩容，给定一个预估计的初始化容量
    5.数组优点：检索效率较高（每个元素占用空间大小相同，内存地址连续，知道首元素内存地址，知道下标，可以通过数学表达式计算元素的内存地址）
    6.数组缺点：随机增删元素效率较低
    7.向数组末尾添加元素，效率高，不受影响
    8.使用最多的集合：ArrayList
        因为向数组末尾添加元素，效率高，不受影响，并且检索、查找某个元素的操作较多
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量10
        List list1 = new ArrayList<>();
        //获取集合中元素的个数，不是获取集合的容量
        System.out.println(list1.size());
        //指定初始化容量20
        List list2 = new ArrayList(20);
    }
}
