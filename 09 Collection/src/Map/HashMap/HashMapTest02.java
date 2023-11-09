package Map.HashMap;

import java.util.HashSet;
import java.util.Set;

/*
向Map中存取，都是先调用key的hashCode方法，然后再调用equals方法
equals方法有可能调，有可能不调
    put(k,v)举例，什么时候equals不会调用？
        k.hashCode()方法返回哈希值，哈希值经过哈希算法转为数组下标，，数组下标位置上如果为null，equals就不需要执行
    get(k)举例，什么时候equals不会调用？
        如果数组下标位置上是null，不需要执行

 注意：如果一个类的equals方法重写了，那么hashCode方法必须重写，
 并且equals方法返回的如果是true，hashCode方法返回的也一样

 equals方法返回true，表示两个对象相同，在同一个单项链表上比较
 所以hashCode方法返回值也相同
 hashCode方法和equals方法直接使用IDEA生成，但是这两个方法需要同时生成

 终极结论：放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法

 对于哈希表数据结构：
    如果两个哈希值相同，一定放到同一个单向链表上
    如果两个哈希值不同，但是由于哈希算法执行结束后转换的数组下标可能相同，会发生哈希碰撞

HashMap集合允许key为null
HashTable的key和value都不能为null，初始化容量11，默认加载因子0.75
HashTable的扩容：原容量*2 +1

 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //s1.equals(s2)结果是true，表示s1和s2是一样的，那么往HashSet集合中放，按理只能放进去1个（无序不可重复）
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());  //2 不符合HashSet存储特点
    }
}
