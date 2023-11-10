package Set.TreeSet;

import java.util.TreeSet;

/*
先按照年龄排序，如果年龄一样，按照姓名排序
compareTo:
    返回0 表示相同，value会覆盖
    返回>0 会继续在右子树上找
    返回<0 会继续在左子树上找

 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        TreeSet<Vip> vip = new TreeSet<>();
        vip.add(new Vip(31,"zhangsan"));
        vip.add(new Vip(31,"zhangli"));
        vip.add(new Vip(13,"lisi"));
        vip.add(new Vip(15,"wangwu"));
        for(Vip v:vip){
            System.out.println(v);
        }
    }
}

class Vip implements Comparable<Vip>{
    int age;
    String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vip v) {
        if(this.age == v.age){
            return this.name.compareTo(v.name);
        }else {
            return this.age - v.age;
        }
    }
}
