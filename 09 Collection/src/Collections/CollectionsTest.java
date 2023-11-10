package Collections;

import java.util.*;

/*
java.util.Collection    集合接口
java.util.Collections    集合工具类
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList不是线程安全的
        List<String> list = new ArrayList<>();
        //转为线程安全的
        Collections.synchronizedList(list);
        //排序
        list.add("abe");
        list.add("efd");
        list.add("abc");
        list.add("dfe");
        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }
        //注意：对list集合中的元素排序，需要保证list集合中的元素实现Comparable接口
        List<Wangba> wangbas = new ArrayList<Wangba>();
        wangbas.add(new Wangba(300));
        wangbas.add(new Wangba(800));
        wangbas.add(new Wangba(500));
        Collections.sort(wangbas);
        for(Wangba w:wangbas){
            System.out.println(w);
        }

        //对Set集合排序
        Set<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("zhangsana");
        set.add("zhangsanv");
        set.add("zhangsang");
        //将Set集合转为List集合
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for(String s2:myList){
            System.out.println(s2);
        }

    }
}

class Wangba implements Comparable<Wangba>{
    int age;

    public Wangba(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wangba{" +
                "age=" + age +
                '}';
    }


    @Override
    public int compareTo(Wangba o) {
        return this.age - o.age;
    }
}
