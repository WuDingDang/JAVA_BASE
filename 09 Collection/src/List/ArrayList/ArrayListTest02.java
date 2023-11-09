package List.ArrayList;

import java.util.*;

/*
ArrayList集合的构造方法
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建一个HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);
        //通过这个构造方法就可以将HashSet集合转成List集合
        List list = new ArrayList(c);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for(int i = 0 ;i < list.size();i ++){
            System.out.println(list.get(i));
        }
    }
}
