package IO;

import java.io.FileReader;
import java.util.Properties;

/*
IO + Properties 联合使用
    经常改变的数据，可以单独写到一个文件中，使用程序动态读取
    将来只需要修改文件的内容，java代码不需要改动，不需要重新编译，
    服务器也不需要重启，就可以拿到动态信息

   类似于以上机制的文件被称为配置文件
   并且当配置文件中的内容格式是 key=value ，这种配置文件叫属性配置文件
   java规范中要求，属性配置文件建议以 .properties结尾，但不必须
   Properties类专门存放属性配置文件中内容的类
 */
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        /*
        Properties 是一个Map集合，key和value都是String类型
        将userinfo文件中的数据加载到Properties对象中
         */
        //新建一个输入流对象
        FileReader reader = new FileReader("10-IO/userinfo.properties");
        //新建一个Map集合
        Properties pro = new Properties();
        //调用Properties对象的load方法，将文件中的数据加载到集合中
        pro.load(reader);    //文件中的数据顺着管道加载到Map集合中，其中等号左边做key，右边做value
        //通过key获取value
        String username = pro.getProperty("username");
        System.out.println(username);

    }
}
