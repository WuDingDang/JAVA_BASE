package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合：无序不可重复
 */
public class HashSetTest {
    public static void main(String[] args) {
        //演示HashSet集合特点
        Set<String> set = new HashSet<>();
        set.add("hello2");
        set.add("hello1");
        set.add("hello3");
        set.add("hello4");
        set.add("hello2");
        set.add("hello2");
        set.add("hello1");
        for(String s:set){
            System.out.println(s);
        }
         /*
        1.存储时的顺序和取出的不同
        2.不可重复
        3.放到HashSet集合中的元素实际上放到了HashMap集合的key部分
         */
    }
}
