package Set;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素的特点：
1.无序不可重复，但是存储的元素可以自动按照大小顺序排序，称为可排序集合
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("f");
        set.add("a");
        set.add("f");
        set.add("g");
        set.add("f");
        set.add("b");
        for(String s: set){
            System.out.println(s);

        }
    }
}
