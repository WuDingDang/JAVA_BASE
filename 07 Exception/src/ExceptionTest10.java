/*
finally面试题
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        int rs = m();
        System.out.println(rs);    //100
    }

    /*
    java语法规则：
        方法体中的代码必须遵循自上而下的顺序依次执行
        return语句一旦执行，整个方法必须结束
     */
    public static int m(){
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }
    /*
    反编译之后的效果
    public static int m(){
        int i = 100;
        int j = i;
        i ++;
        return j;
    }


     */
}
