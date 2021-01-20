package 算法and数据结构.数据结构.Stack.MyStack.MyLinkStack;

public class MyLinkedListStack {
    private LinkedNode top; // top作为栈顶元素所在的对象
    private int sive;  // 未压栈  为0

    public MyLinkedListStack(){
        this.top=null;
    }
    // 压栈
    public void push(Object obj){
        this.top=new LinkedNode(obj,this.top);   // 核心代码 ----> 使top指向栈顶元素
        sive++;
    }
    // 出栈
    public Object pop(){
         LinkedNode value=top;
         top=top.next;
         value.next=null;
         sive--;
         return value.date;
    }
    // 查看栈的长度
    public int length(){
        return sive;
    }
}
class LinkedNode{
    Object date;
    LinkedNode next;
    public LinkedNode(Object date,LinkedNode next){
        this.date=date;
        this.next=next;
    }
}
class MyLinkedListStackTest{
    public static void main(String[] args) {
        MyLinkedListStack stack=new MyLinkedListStack();
        for (int i = 0; i < 5; i++) {
                         stack.push(i);
                    }
        System.out.println(stack.length());
               for (int i = 0; i < 5; i++) {
                        System.out.print(stack.pop()+" ");
                   }
        System.out.println();
        System.out.println(stack.length());
    }
}