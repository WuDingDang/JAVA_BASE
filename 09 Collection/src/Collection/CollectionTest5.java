package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
测试contains方法   remove同理
放在集合里的元素，需要重写equals方法，否则比较的是内存地址
 */
public class CollectionTest5 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("jack");
        User u2 = new User("jack");
        c.add(u1);
        System.out.println(c.contains(u2));   //false     u1.equals(u2)  如果euqals()没有重写 判断的是内存地址  重写后为true
        Integer x = new Integer(1000);
        Integer y = new Integer(1000);
        System.out.println(x.equals(y));
        c.add(x);
        System.out.println(c.contains(y));      //true

        Collection c2 = new ArrayList();
        String s1 = new String("hello");
        String s2 = new String("hello");
        c2.add(s1);
        c2.remove(s2);
        System.out.println(c2.size());    //0
    }
}

class User{
    private String name;
    public User(){}
    public User(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof User)) return false;
        if(obj == this) return true;
        User u = (User)obj;
        return u.name.equals(this.name);
    }
}
