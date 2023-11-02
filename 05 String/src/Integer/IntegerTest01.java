package Integer;

public class IntegerTest01 {
    public static void main(String[] args) {
        /*
   1、 java中为8中基本数据类型又对于准备了8中包装类型
    8种包装类属于引用数据类型，父类是Object
   2、 为什么要在提供8种包装类
       假如 调用 doSome(Object obj) 方法需要传递一个数字，
            但数字属于基本数据类型，而doSome()方法的参数是Object类，可见doSome()方法无法接受基本数据类型
 */
/*
    8中基本数据类型对应的包装类型：
        基本数据类型                  包装类型
   ----------------------------------------------------
        byte                        java.lang.Byte(父类Number)
        short                       java.lang.Short(父类Number)
        int                         java.lang.Integer(父类Number)
        long                        java.lang.Long(父类Number)
        float                       java.lang.Float(父类Number)
        double                      java.lang.Double(父类Number)
        boolean                     java.lang.Boolean(父类Object)
        char                        java.lang.Character(父类Object))
 */
/*
    Number是一个抽象类，无法实例化
    Number 类中的方法：负责拆箱
        byte byteValue()
        abstract double doubleValue()
        abstract float floatValue()
        abstract int intValue()
        abstract long longValue()
        short shortValue()

 */
        //基本数据类型  --> 引用数据类型
        Integer integer = new Integer(123);
        System.out.println(integer);
        float f = integer.floatValue();
        System.out.println(f);
        int i = integer.intValue();
        System.out.println(i);
        Integer integer1 = new Integer("111");
        System.out.println(integer1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //自动装箱

        Integer x = 1000;
        int y = x;
        Integer z = 1000;
        Integer g = 1000;
        System.out.println(x == z);
        System.out.println(g == z);
        /*
         *  java 中为了提高程序的执行效率，将[-128,127]之间所有的包装对象提前创建好
         * 放到一个方法区的 “整数型常量池”中，目的是只要用这个区间的数据，就不需要再new了，
         * 直接从整数型常量池中取出来
         * 缓存优点：效率高
         * 缓存缺点：耗费内存
         */
        Integer m = 2;
        Integer n = 2;
        System.out.println(m == n);

    }
}
