package IO.ObjectInputStream;

import bean.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
反序列化集合
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        List<User> userList = (List<User>)ois.readObject();
        for(User u:userList){
            System.out.println(u);
        }
        ois.close();

    }
}
