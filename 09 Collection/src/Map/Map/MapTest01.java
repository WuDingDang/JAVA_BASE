package Map.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
1.Map和Collection没有继承关系
2.Map集合以key和value的方式存储数据：键值对
    key和value都是引用数据类型
    key和value都是存储对象的内存地址
    key起到主导地位，value是key的附属品
3.Map接口中常用方法
    V put(K key,V value)     向Map集合中添加键值对
    V get(Object key)       通过key获取value
    void clear()        清空Map集合
    boolean containsKey(Object key)         判断Map中是否包含某个key
    boolean containsValue(Object value)     判断Map中是否包含某个value
    boolean isEmpty()           判断Map集合中元素个数是否为0
    Set<K> keySet()         获取Map集合所有的key（所有的键是一个set集合）
    V remove(Object key)        通过key删除键值对
    int size()          获取Map集合中键值对的个数
    Collection<V> values()         获取Map集合中所有value，返回一个Collection
    Set<Map.Entry<K,V>> entrySet()      将Map集合转成Set集合
    eg.map1集合对象
        key             value
    ------------------------------
        1              zhangsan
        2              lisi
        3              wangwu
        4              zhaoliu

        Set set1 = map1.entrySet();    [注意]:Map集合通过entrySet()方法转换成的这个Set集合，Set集合中元素的类型是Map.Entry<K,V>
                                        Map.Entry和String一样，都是类型的名字；Map.Entry是静态内部类，是Map中的静态内部类
        set集合对象：
        1=zhangsan
        2=lisi
        3=wangwu
        4=zhaoliu
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //向map集合中添加键值对
        map.put(1,"zhangsan");
        map.put(2,"wangwu");
        map.put(3,"lisi");
        map.put(4,"zhaoliu");
        //通过key获取value
        System.out.println(map.get(2));
        //获取键值对的数量
        System.out.println(map.size());
        //通过key删除key-value
        map.remove(2);
        System.out.println(map.size());
        //contains方法底层调用的都是equals进行比对，所以自定义类型需要重写equals方法
        //判断是否包含某个key
        System.out.println(map.containsKey(4));
        //判断是否包含某个value
        System.out.println(map.containsValue("wangwu"));
        //获取所有的value
        Collection<String> c = map.values();
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //清空集合
        map.clear();
        //判断是否为空
        System.out.println(map.isEmpty());

    }
}
