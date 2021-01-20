package 算法and数据结构.数据结构.Queue.MyQueue.MyArraysQueue.EasyQueue.ArraysQueue;

public class MyArraysQueue {
    private Object[] date;
    private int sive; // 队列容量
    private int header; // 队列的头
    private int rear; // 队列的尾
    // 初始化队列容量
    public MyArraysQueue(){
        this(10);       // 初始化容量为10
    }
    public MyArraysQueue(int sive){
        if (sive<0){
            throw new RuntimeException("初始化大小不能小于0：" + sive);
        }else{
            this.sive=sive;
            date=new Object[sive];
        }
    }
    //判断 队列是否为空
    public boolean empty(){
        return rear == header;
    }
    //入列
    public void add(Object obj){
        if (rear==sive-1){
            throw new RuntimeException("队列已满，无法插入新的元素！");
        }else{
            date[rear++]=obj;
        }
    }
    // 出列   出列意味着  输出第一个进入队列的元素 并删除！
    public Object poll(){
        if (empty()){
            throw new RuntimeException("空队列异常！");
        }else{
            Object headDate=this.date[header];
            this.date[header++]=null;   // 头指针移动  并且当前头元素删除（null）
            //sive--;         // 队列长度减一
            return headDate;
        }
    }
    // 返回队列长度
    public int length(){
        return rear-header;  //这里的长度  也可以  用sive表示  但为了突出双指针的运用 就这样写也ok的
    }
    // 返回队首元素但不删除
    public Object peek(){
        if (empty()){
            throw new RuntimeException("空队列异常！");
        }else{
            return date[header];
        }
    }
}
class MyArraysQueueTest{
    public static void main(String[] args) {
        MyArraysQueue Queue=new MyArraysQueue();
        System.out.print("存入元素为：");
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            Queue.add(i);
        }
        System.out.println();
        System.out.println(Queue.length());
        System.out.print("输出元素为：");
        for (int i = 0; i < 5; i++) {
            System.out.print(Queue.poll());
        }
        System.out.println();
        System.out.println(Queue.length());
    }
}