package 算法and数据结构.数据结构.Stack.MyStack.MyLinkedListStack;

import javax.print.attribute.IntegerSyntax;
import java.util.LinkedList;

public class MyLinkedListStack<E> {
    private LinkedList<E>  list=new LinkedList<>();

    //压栈 （入栈）
    public void push(E e){
        list.add(e);
    }
    // 出栈(弹栈)
    public E pop(){
        return list.removeFirst();
    }
    //查看栈定元素但不移除
    public E peek(){
        return list.getFirst();
    }
    // 判断栈是否为空
    public boolean empty(){
        return list.isEmpty();
    }
    public String toString(){
        return list.toString();
    }
}
class MyLinkedListStackTest{
    public static void main(String[] args) {
        MyLinkedListStack<Integer> stack=new MyLinkedListStack<>();
        MyLinkedListStack<Integer> stack1=new MyLinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.toString());
        System.out.println(stack1.toString());
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop()+" ");
        }
    }
}