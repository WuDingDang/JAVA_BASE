package bean;

import java.io.Serializable;

public class Student implements Serializable {
    //IDEA自动生成序列化版本号
    private static final long serialVersionUID = 9196540279992417358L;
    //建议将序列化版本号手动写出来，不建议自动生成
   // private static final long serialVersionUID = 1L;   //java虚拟机识别一个类时，先通过类名，如果类名一致，再通过序列化版本号
    private int no;
    private String name;

    //过了很久，Student这个类的源码改动了
    //源码改动之后，需要重新编译，编译后生成全新的字节码文件
    //并且class文件再次运行的时候，java虚拟机生成的序列化版本号也会发生响应的改变
    private int age;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
