package Enum;
/*
   1. 枚举是一种引用数据类型
   2. 枚举类型定义语法：
        enum 枚举类型名{
            枚举值1,枚举值2,...
        }
   3. 结果只有两种情况，建议使用布尔类型，结果超过两种并且还可以是一枚一枚列举出来的，建议使用枚举类型
 */
public class EnumTest01 {
    public static void main(String[] args) {
        Result rs =  divide(10,0);
        System.out.println(rs == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    /*
    public static boolean divide(int a,int b){
        try {
            int c = a / b;
            return true;
        }catch (Exception e){
            return false;
        }
    }

     */
    public static Result divide(int a,int b){
        try {
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }


    //枚举编译之后也生成class文件
    //枚举也是一种引用数据类型
    //枚举中的每一个值可以看作是常量
    enum Result{
        SUCCESS,FAIL

    }


}
