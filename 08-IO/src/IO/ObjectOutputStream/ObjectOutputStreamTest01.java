package IO.ObjectOutputStream;

import bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
1.java.io.NotSerializableException:不支持序列化
2.参与序列化和反序列化的对象，必须实现Serializable接口
3.Serializable接口是一个标志接口
public interface Serializable {
}
里面没有代码
起标识作用，java虚拟机看到这个类实现这个接口，可能会对这个类进行特殊待遇
Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口后，会为该类自动生成一个序列化版本号

序列化版本号的作用：
    java.io.InvalidClassException: bean.Student;
    local class incompatible:
         stream classdesc serialVersionUID = -4119497900008520366, （修改前）
         local class serialVersionUID = -7370765433862913044        （修改后）

 java中采用什么机制区分类？
    1.首先通过类名进行比对，如果类名不一样，肯定不是同一个类
    2.如果类名一样，靠序列化版本号进行区分
    java虚拟机可以区分不同的人编写的同一个类（不同）这两个类实现Serializable接口

 自动生成序列化版本号的缺陷：
    一旦代码确定后，不能修改，因为只要修改，必然重新编译，此时会生成新的序列化版本号，
    此时java虚拟机会认为这是一个全新的类

 最终结论：凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号，
            这样这个类即使修改了代码，但是版本号不变，java虚拟机会认为是同一个类


 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建java对象
        Student s = new Student(1111,"xiaoming");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        oos.writeObject(s);

        oos.flush();
        oos.close();



    }
}
