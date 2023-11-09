package foreach;
/*
JDK5后 新特性：增强for循环，或者叫foreach
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {2,33,21,23,27,54};
        //遍历数组（普通）
        for(int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
        //增强for
        /*
        for(元素类型 变量名 ： 数组或集合){
           System.out.println(变量名);
        }
         */
        //缺点：没有下标
        for(int data : arr){
            //data就是数组中的元素
            System.out.println(data);
        }
    }
}
