package Map.Properties;

import java.util.Properties;

/*
Properties是一个Map集合，继承HashTable
Properties的key和value都是String类型
Properties被称为属性类对象
线程安全
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();
        //存
        pro.setProperty("username","root");
        pro.setProperty("password","123");
        //取
        System.out.println(pro.getProperty("username"));

    }
}
