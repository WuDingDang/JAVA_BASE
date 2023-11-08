package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains方法
    boolean contains(Object o)      判断集合中是否包含某元素 底层调用equals方法
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println(c.size());
        String x = new String("abc");
        System.out.println(c.contains(x));   //true   判断集合中是否存在"abc",(底层调用了equals()方法)
    }
}
