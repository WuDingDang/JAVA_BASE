## 1.JDK 和 JRE 有什么区别？

JDK：Java Development Kit 的简称，**Java 开发工具包**，提供了 Java 的开发环境和运行环境。

 JRE：Java Runtime Environment 的简称，**Java 运行环境**。

JDK包含了JRE



## 2.final 关键字

- final修饰的类无法被继承
- final修饰的方法无法被覆盖，重写
- final修饰的变量只能赋一次值
- final修饰的引用只能指向一个对象，但内部的数据可以修改
- final修饰的实例变量需要手动赋值



## 3. 抽象方法和普通方法的区别

普通类不能包含抽象方法，抽象类可以包含抽象方法。

抽象类不能直接实例化，普通类可以直接实例化。

抽象类不能使用final修饰（抽象类需要其他类继承，而final修饰的类无法被继承，矛盾）



## 4.抽象方法和接口的区别

都不能实例化

- 抽象类：abstract修饰；单继承；可以包含抽象方法和非抽象方法，非抽象方法需要有方法体；可以有构造函数；可以有main方法
- 接口：implements修饰；类可以实现多个接口；接口不能有默认的方法实现；不能有构造函数；不能有main方法



## 5.在 Java 中，为什么不允许从静态方法中访问非静态变量？

- 静态变量属于类本身，在类加载的时候就会分配内存，可以通过类名直接访问
- 非静态变量属于类的对象，只有在类的对象产生时，才会分配内存，通过类的实例去访问
- 静态方法也属于类本身，但是此时没有类的实例，内存中没有非静态变量，所以无法调用



## 6.Math

- Math.ceil():向上取整
- Math.floor():向下取整
- Math.round()：四舍五入 (加0.5然后向下取整)



## 7.基本数据类型

byte,short,long,int,float,double,char,boolean



## 8.== 和 equals 的区别是什么？

基本数据类型：== 比较的是值

引用数据类型：==比较的是地址

equals不能用于基本类型的比较

如果没有重写equals，equals就相当于==

如果重写了equals方法，equals比较的是对象的内容

两个对象的 hashCode() 相同，equals() 不一定 true。



## 9.操作字符串的类

String、StringBuffer、StringBuilder

### 9.1Stirng

凡是双引号括起来的都会在字符串常量池中有一份

new的时候一定会在堆内存中开辟空间

#### 9.1.1 String str="i"与 String str=new String(“i”)一样吗？

String str="i"：Java 虚拟机会将其分配到常量池中

String str=new String(“i”) ：被分到堆内存中

```java
String s1 = "hello";
String s2 = "hello";
//以上创建几个对象？
 /*
        一共三个对象
        方法区中字符串常量池中有一个hello对象
        堆内存中有两个String对象
 */
```

```java
new String("ab")   //创建2个对象 1.new在堆中创建一个对象 2.字符串常量池中创建一个对象“ab”
```

#### 9.1.2 new String("a") + new String("b") 会创建几个对象？

6个

1.new StringBuilder()  ：当“+”号左右两边有⼀个是变量则拼接操作底房都是 StringBuilder 的 append 实现了

2.new String("a")

3.常量池中的"a"

4.new String("b")

5.常量池中的"b"

6.new String("ab")  但在常量池中没有“ab”，因为调用了toString()



#### 9.1.2 String类为什么不可变？？？

  源代码中，String类有一个byte数组，这个byte数组是使用final修饰的
因为数组一旦创建，长度不可变，并且被final修饰的引用，一旦指向某个对象之后，不可再指向其他对象，所以不可变



#### 9.1.3 String 常用方法





### 9.2 StringBuffer 和 StringBuilder

StringBuffer：线程安全

StringBuilder：非线程安全

用于对字符串进行频繁拼接，字符串反转 reverse()

StringBuffer/StringBuilder的初始化容量是16，当存满之后会进行扩容，底层调用数组拷贝的方法System.arraycopy()进行扩容，所以适用于字符串的频繁拼接

#### 9.2.1 StringBuffer/StringBuilder 为什么可变？？？

  源代码 StringBuffer/StringBuilder内部实际上是一个byte数组，这个数组没有被final修饰
    

#### 9.2.2 如何优化StringBuffer性能？

在创建StringBuffer时，尽可能给定一个初始化容量，最好减少底层数组的扩容次数，预估计
关键点：给一个合适的初始黄容量，可以提高程序的执行效率



# 10. throw 和 throws 的区别

- throw：作用在方法内，表示抛出具体异常，由方法体内的语句处理；一定抛出了异常；
- throws：作用在方法的声明上，表示抛出异常，由调用者来进行异常处理；可能出现异常，不一定会发生异常；



# 11.  catch 中 return 了，finally 还会执行吗？

会

执行顺序 ：catch --> finally --> catch中的return

try和catch中有return 都在finally后输出



# 12.常见的异常类

- 空指针异常：NullPointerException
- 数组下标越界异常：IndexOutOfBoundsException
- 打开文件失败抛出：FileNotFoundException
- IO异常：IOException
- 强制类型转换异常：ClassCastException
- 字符串转数字异常：NumberFormatException
- 运算异常：ArithmeticException
- 参数不正确/不合法：IllegalArgumentException
- 数据库相关异常：SQLException



# 13. IO 流

- 按流分类
  - 输入流
  - 输出流
- 按读取数据方式
  - 字节流：inputStream、outputStream
  - 字符流：reader、writer



流的四大家族

java.io.InputStream               字节输入流

java.io.OutputStream            字节输出流

java.io.Reader					 	字符输入流

java.io.Writer						   字符输出流



# 14. 重写和重载

重写（方法覆盖）的条件：

- 两个类必须有继承关系
- 重写后的方法和之前的方法有：
  - 相同的返回值类型
  - 相同的方法名
  - 相同的形式参数列表
- 访问权限不能更低，可以更高
- 重写后的方法不能比之前的方法抛出更多的异常，可以更少
- 注意：
  - 只针对方法，和属性无关
  - 私有方法无法覆盖
  - 构造方法不能被继承，所以不能覆盖
  - 方法覆盖只针对实例方法，静态方法覆盖没有意义

方法重载的条件（体现多态）：

- 同一个类中
- 方法名相同
- 参数列表不同（个数，顺序，类型）



# 15.实例化对象的方式

- new
- clone
- 反射
- 序列化，反序列化



# 16.java容器

- Collection（接口）

  - List（接口）

    - ArrayList
    - LinkedList
    - Vector

  - Set（接口）

    - HashSet

    - SortedSet（接口）

      -TreeSet

- Map（接口）

  - HashMap

  - HashTable

    -Properties

  - SortedMap（接口）

    -TreeMap



# 17.Collection 和 Collections 有什么区别？

- Collection是最基本的集合接口，Collection派生了两个子接口list和set，分别定义了两种不同的存储方式
- Collections是一个包装类，它包含各种有关集合操作的静态方法（对集合的搜索、排序、线程安全化等）；此类不能实例化，就像一个工具类，服务于Collection框架



# 18.如何将⼀个线程安全的 Arraylist 集合转为线程安全的

使用集合工具类Collections

```
List list = new ArrayList();
Collections.synchronizedList(list);
```





 





