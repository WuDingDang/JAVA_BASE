package List.LinkedList;
/*
链表优点：随机增删元素效率较高（增删元素不涉及大量元素位移
链表缺点：查询效率低，每一次查找某个元素时都需要从头节点开始往下遍历
 */
public class Link {
    //头节点
    Node header;
    int size = 0 ;
    public int size(){return size;}
    //向链表中添加元素
    public void add(Object data){
        //创建一个新的节点对象
        //让之前单链表的末尾节点next指向新节点对象
        if(header == null){
            //说明还没有节点
            //new一个新的节点对象作为头节点
            header = new Node(data, null);  //这个时候头节点既是头节点又是末尾节点
        }else {
            //有头节点
            //找出末尾节点，让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
        size++;
    }

    //查找末尾节点的方法
    private Node findLast(Node node){
        if(node.next == null) return node;
        //程序到这里，说明node不是末尾节点，递归
        return findLast(node.next);
    }

    //删除链表中某个元素的方法
    public void remove(Object data){

    }
    //修改链表中某个数据
    public void modify(Object newData){

    }
    //查找链表中某个元素的下标
    public int find(Object data){
        return 0;
    }
}
