package List.LinkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

/*
链表优点：由于链表上的元素在空间存储上内存地址不连续，所以随机增删元素的时候不会有大量元素位移，因此随机增删效率较高
在以后的开发中，如果遇到随机增删集合中的元素业务比较多时，建议使用LinkedList

链表缺点：不能通过数学表达式计算被查找元素的内存地址，每次查找都是从头节点开始遍历，直到找到为止。
所以LinkedList检索、查找的效率较低

加元素都是往末尾添加，所以ArrayList比LinkedList用的多
LinkedList没有初始化容量，first和last引用都是null
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        //注意：ArrayList之所以检索效率高，不是单纯因为有下标，是因为底层数组发挥的作用
        //LinkedList也有下标，但是检索、查找某个元素效率较低，因为只能从头节点开始遍历
        for(int i = 0 ; i < list.size();i ++){
            System.out.println(list.get(i));
        }
    }
}
