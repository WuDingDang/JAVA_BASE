package Random;

import java.util.Random;

/*
    编写程序，生成5个不重复的随机数[0-100]，重复的话重新生成，
    最终生成的5个随机数放到数组
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length;i ++){
            arr[i] = -1;
        }
        int index = 0 ;
        while (index < arr.length){
            int num = random.nextInt(6);
            if(!contains(arr,num)){
                arr[index] = num;
                index ++;
            }
        }
        for(int i = 0 ; i < arr.length;i ++){
            System.out.println(arr[i]);
        }

    }

    public static boolean contains(int[] arr,int key){
         /*
        有问题（排序问题）
        //对数组排序升序
        Arrays.sort(arr);
        for(int i = 0 ;i < arr.length;i ++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        //二分法查找结果 >= 0 ，表示找到了
        int res = Arrays.binarySearch(arr,key);
        return res >= 0;
         */
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}

