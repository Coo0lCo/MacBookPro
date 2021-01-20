package LeetCode.链表栈队列习题;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 用栈实现独立额 {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
    }
}
class MyQueue {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> MyQueue;
    /** Initialize your data structure here. */
    public MyQueue() {

    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
        
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return MyQueue.pop();
    }
    /** Get the front element. */
    public int peek() {
        return MyQueue.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return MyQueue.isEmpty();
    }
}