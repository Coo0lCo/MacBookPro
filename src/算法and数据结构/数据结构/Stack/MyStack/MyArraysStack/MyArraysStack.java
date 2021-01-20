package 算法and数据结构.数据结构.Stack.MyStack.MyArraysStack;

/*
        Using Array to realize Stack
 */
public class MyArraysStack {
    //date_Arrays
    private Object[] obj;
    //index 可认为是指针  或者是索引 下标
    private int index=-1;
    //栈容量
    private int capacity;
    public MyArraysStack(){
            this(10);   //初始化容量为10
    }
    //初始化 栈容量
    public MyArraysStack(int capacity){
        if (capacity>=0){
            this.capacity=capacity;
            this.obj=new Object[this.capacity];
        }else{
            System.out.println("初始化容量不能小于0");
        }
    }
    //压栈
    public void push(Object obj){
        if (capacity<=0){
            System.out.println("初始化容量小于或等于0无法压栈");
        }else{
            this.obj[++this.index]=obj;
        }
    }
    //弹栈
    public Object pop(){
        if (index==-1){
            // 如果尚未添加元素  则抛出异常
            throw new RuntimeException("栈为空！");
        }else{
            return this.obj[index--];
        }
    }
    //查看栈顶元素 但不删除
    public Object peek(){
        if (index==-1){
            throw new RuntimeException("栈为空！");
        }else {
            return this.obj[index];
        }
    }
    // 判断栈是否为空
    public boolean empty(){
        if (index==-1){
            return true;
        }else{
            return false;
        }
    }
    //返回对象在 栈内的位置
    public int search(Object ojb){
        int index01=index;
        if (index==-1){
            throw new RuntimeException("栈为空！");
        }else{
            while(index01!=-1){
                if (this.obj[index01--]==obj){
                    break;
                }
            }
            if (index01==-1){
                throw new RuntimeException("尚未添加此元素！");
            } else {
                return index01+2;
            }
        }
    }
}
class MyArraysStackTest{
    public static void main(String[] args) {
        MyArraysStack stack=new MyArraysStack();
             for (int i = 0; i < 5; i++) {
                 stack.push(i);
             }
                for (int i = 0; i < 5; i++) {
                         System.out.print(stack.pop()+" ");
                   }
    }
}