package Integer;

public class IntegerTest03 {
    public static void main(String[] args) {
        //int -> String
        int i = 100;
        String s = i + "";
        String s2 = String.valueOf(i);

        //String -> int
        int x = Integer.parseInt("123");

        //int -> Integer(装箱)
        Integer integer = Integer.valueOf(i);
        Integer y = 100;

        //Integer ---> int 拆箱
        int i2 = y.intValue();
        int i1 = y;

        //String ---> Integer
        Integer integer1 = Integer.valueOf("123");

        //Integer ---> String
        String s1 = String.valueOf(integer1);

    }
}
