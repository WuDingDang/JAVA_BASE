package foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
集合使用增强for
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("kitty");
        //遍历 使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用下标方式
        for(int i = 0 ; i < list.size();i ++){
            System.out.println(list.get(i));
        }
        //使用foreach
        for(String s:list){
            System.out.println(s);
        }


    }
}
