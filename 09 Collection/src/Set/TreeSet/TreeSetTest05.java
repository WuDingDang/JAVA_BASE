package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中元素可排序的第二种方式：使用比较器

最终结论：
    放到TreeSet或TreeMap集合key部分的元素要排序，两种方式：
        1.放在集合中的元素实现java.lang.Comparable接口
        2.在构造TreeSet或者TreeMap集合的时候传一个比较器对象
Comparable和Comparator怎么选择？
    当比较规则不会发生改变或只有1个，建议实现Comparable接口
    如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口

 Comparator接口的设计符合OCP原则
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        //创建TreeSet集合时，需要使用比较器
        //TreeSet<Wugui> wuguis = new TreeSet<>();   //没有通过构造方法传递一个比较器

        //1.给构造方法传递比较器
       // TreeSet<Wugui> wuguis = new TreeSet<>(new WuguiComparator());
        //2.使用匿名内部类(这个类没有名字，直接new接口)
        TreeSet<Wugui> wuguis = new TreeSet<>(new Comparator<Wugui>() {
            @Override
            public int compare(Wugui o1, Wugui o2) {
                return o1.age - o2.age;
            }
        });
        wuguis.add(new Wugui(300));
        wuguis.add(new Wugui(500));
        wuguis.add(new Wugui(100));
        for(Wugui w:wuguis){
            System.out.println(w);
        }

    }
}

class Wugui{
    int age;

    public Wugui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wugui{" +
                "age=" + age +
                '}';
    }
}

//单独编写一个比较器
//比较器实现java.util.Comparator接口  （Comparable是java.lang包下。Comparator是java.util包下）
class WuguiComparator implements Comparator<Wugui>{

    @Override
    public int compare(Wugui o1, Wugui o2) {
        //指定比较规则：按照年龄排序
        return o1.age - o2.age;
    }
}
