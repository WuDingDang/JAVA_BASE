package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合
1.底层是哈希表/散列表数据结构
2.哈希表是一个数组和单向链表的结合体
    数组：在查询方面效率高，随机增删方面效率低
    单向链表：随机增删效率高，查询效率低
    哈希表将以上两种数据结构融合在一起，充分发挥各自的优点
3.HashMap底层的源代码
public class HashMap{
    //HashMap底层实际是一个数组（一维数组）
    Node<K,V>[] table;
    //静态内部类HashMap.Node
    static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;     //哈希值（哈希值是key的hashCode()方法的执行结果，hash值通过哈希函数/算法，可以转换存储数组的下标）
        final K key;       //存储到Map集合中的key
        V value;            //存储到Map集合中的value
        Node<K,V> next;     //下一个节点的内存地址
    }
}

哈希表/散列表：一维数组，这个数组中的每个元素是一个单向链表（数组和链表的结合体）

map.put(k,v)的实现原理
    1.先将k，v封装到Node对象中
    2.底层会调用k的hashCode()方法得出hash值，然后通过哈希函数/算法，将hash值转换成数组下标。
        下标位置上如果没有任何元素，就把Node添加到这个位置上，如果下标对应的位置上有链表，此时，
        会拿着k和链表上的每一个节点中的key进行equals，如果所有的equals方法返回的都是false，那么
        这个新的节点将会被添加到链表的末尾，如果其中有一个equals返回的true，那么这个节点的value将会被覆盖

map.get(k)原理
    1.先调用k的hashCode()方法得出哈希值，通过哈希算法转换成数组下标，通过数组下标快速定位到某个位置上，
      如果这个位置上什么也没有，返回null，如果这个位置上有单向链表，那么会拿着key和单向链表上的每个节点
      中的key进行equals，如果所有equals方法返回false，那么get方法返回null，只要其中有一个节点的k和参数k
      equals的时候返回true，这个节点的value就是要找的value

为什么哈希表的随机增删、以及查询效率都很高？
    增删在链表上完成，查询不需要都扫描，只需要部分扫描

重点：HashMap集合的key，会先后调用两个方法：一个是hashCode()，一个是equals()，这两个方法都需要重写
equals默认比较的是两个对象的内存地址

HashMap集合中key的特点
    无序（不一定挂到哪个但单表上），不重复（equals方法保证HashMap集合的key不重复）
    如果key重复了，value会覆盖

放在HashMap集合key部分的元素就是放在HashSet集合中
所以HashSet集合中的元素也需要同时重写hashCode()和equals()

注意：同一个单链表上所有节点的hash相同，因为数组下标相同，但是同一个链表上的key不相同

如果将所有hashCode()返回值设置为固定值，那么会导致底层哈希表变成纯单向链表，该情况为散列分布不均匀
如果将所有hashCode()返回值设置为不一样的值，那么会导致底层哈希表变成一维数组，该情况为散列分布不均匀

重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法
HashMap集合初始化容量是16，默认加载因子是0.75
默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容
重点：HashMap集合初始化容量必须是2的倍数（官方推荐），因为达到散列均匀，为了提高HashMap集合的存取效率所必须的
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的特点
        //Integer是key，它的hashCode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"zhangsan");
        map.put(6666,"lisi");
        map.put(7777,"wangwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king");   //key重复，value会覆盖
        System.out.println(map.size());
        //遍历Map集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for(Map.Entry<Integer, String> s:set){
            //验证结果：HashMap集合key部分元素：无序不可重复
            System.out.println(s.getKey()+ "=" + s.getValue());
        }
    }
}
