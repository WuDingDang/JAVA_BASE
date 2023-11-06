package IO.ObjectOutputStream;

import bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
一次序列化多个对象：将对象放到集合中，序列化集合
参与序列化的ArrayList集合以及集合里的元素User都需要实现ava.io.Serializable接口
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));
        oos.writeObject(userList);
        oos.flush();
        oos.close();
    }
}
