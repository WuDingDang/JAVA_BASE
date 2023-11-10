package Set.TreeSet;

import java.util.TreeSet;

/*
1.TreeSet集合底层实际是TreeMap
2.TrreMap集合底层是二叉树
3.放到TreeSet集合中的元素等同于放到TreeMap集合中的key部分
4.TreeSet集合中的元素：无序不重复，但是可以按照元素大小顺序自动排序，称为可排序集合
自定义类型不能排序，因为没有实现Comparable接口
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhaliu");
        for(String s:ts){
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(200);
        ts2.add(300);
        ts2.add(123);
        ts2.add(123);
        ts2.add(333);
        for(Integer i:ts2){
            System.out.println(i);
        }

    }
}
