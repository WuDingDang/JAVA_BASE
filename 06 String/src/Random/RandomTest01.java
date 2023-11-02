package Random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        //随机产生一个int范围内的数字
        int i = random.nextInt();
        System.out.println(i);
        //产生[0-100]之间的随机数，不包括101
        int i1 = random.nextInt(101);
        System.out.println(i1);
    }
}
