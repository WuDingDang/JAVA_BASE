package List.Generic;
/*
自定义泛型
 */
public class GenericTest03<E> {
    public void doSome(E e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        //new 对象了泛型指定是String类型
        GenericTest03<String> gg = new GenericTest03<>();
        gg.doSome("ee");
        //类型不匹配
        //gg.doSome(100);
        //不用泛型就是Object类型
        GenericTest03 g = new GenericTest03();
        g.doSome(new Object());
        MyIterator<String> myIterator = new MyIterator<>();
        String s =myIterator.get();

        MyIterator<Integer> myIterator2 = new MyIterator<>();
        Integer s2 =myIterator2.get();
    }
}
class MyIterator<T>{
    public T get(){
        return null;
    }
}