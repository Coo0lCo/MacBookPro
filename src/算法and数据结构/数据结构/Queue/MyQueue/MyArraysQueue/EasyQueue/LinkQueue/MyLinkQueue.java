package 算法and数据结构.数据结构.Queue.MyQueue.MyArraysQueue.EasyQueue.LinkQueue;



public class MyLinkQueue {
    private int sive;
    private LinkNode header;
    private LinkNode  rear;
    // 入列 插入
    public void add(Object obj){
        if (empty()){
            header=new LinkNode(obj,null);
            rear=header;
        }else{
            LinkNode newNode=new LinkNode(obj,null);
            rear.next=newNode;
            rear=newNode;
        }
        sive++;
    }
    // 查询队列长度
    public int length(){
        return sive;
    }
    //判空
    public boolean empty(){
        return sive==0;
    }
    // 出列
    public Object poll(){
        if (empty()){
            throw new RuntimeException("空队列异常");
        }else{
            LinkNode l=header;
            header=header.next;
            l.next=null;
            sive--;
            return l.date;
        }
    }

    // 查看当前队首元素
    public Object peek(){
        if (empty()){
            throw new RuntimeException("空队列异常");
        }else{
            return header.date;
        }
    }
}
class LinkNode{
     protected LinkNode next;
     protected Object date;
    public LinkNode(Object obj,LinkNode next){
        this.date=obj;
        this.next=next;
    }
}
class MyLinkQueueTest{
    public static void main(String[] args) {
        MyLinkQueue queue=new MyLinkQueue();
        System.out.print("添加元素为：");
        for (int i = 1; i < 5; i++) {
            System.out.print(i);
            queue.add(i);
        }
        System.out.println();
        System.out.println("头节点元素为："+queue.peek()+" 队列长度为："+queue.length());
        System.out.println(queue.empty());
        System.out.print("输出元素为：");
        int length= queue.length();
        for (int i = 1; i <=length; i++) {
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
        System.out.println(queue.empty());
        System.out.println("当前队列长度："+queue.length());

    }
}