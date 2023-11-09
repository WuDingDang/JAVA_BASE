package Map.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历：

 */
public class MapTest02 {
    public static void main(String[] args) {
        //1.获取所有的key，通过遍历key，来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //遍历map集合
        //获取所有的key
        Set<Integer> keys = map.keySet();
        //遍历key，通过key获取value
        //方法1：迭代器
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("===============");
        //方法2：foreach
        for(Integer key : keys){
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("===============");
        //2.Set<Map.Entry<K,V>> entrySet()
        //把Map集合直接全部转换成Set集合
        //Set集合中元素类型是Map.Entry<K,V>
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        //遍历Set集合，每一次取出一个Node
        //迭代器
        Iterator<Map.Entry<Integer, String>> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println(entry);
            Integer key = entry.getKey();
            String value = entry.getValue();
        }

        //增强for
        //效率高，因为获取key和value都是直接从node对象中获取的属性值
        //适合大数据量
        for(Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}
