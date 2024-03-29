package IO.ObjectInputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
反序列化


 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //反序列化，读
        Object o = ois.readObject();
        //反序列化回来是一个学生对象，所以会调用学生对象的toString方法
        System.out.println(o);
        ois.close();
    }
}
