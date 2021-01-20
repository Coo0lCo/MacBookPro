package 算法and数据结构.数据结构.Stack.javaStackTest;

import java.util.Iterator;

/*
以下用栈来处理一个引用数据类型，也可以说是抽象数据类型。
 */
public class StackTest<Item>implements Iterator {
    public static void main(String[] args) {
        java.util.Stack<String> stack=new java.util.Stack<String>();
        //push添加一个元素(实际上存储的是一个引用，一个内存地址，存储在栈内存中)
        stack.push("李永杰");
        //pop删除一个元素
        stack.pop();
        studen ss=new studen(999,"MrLi");
        java.util.Stack<studen> s=new java.util.Stack<studen>();
        System.out.println(ss);
        System.out.println(s.push(ss));
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
class studen{
        int id;
        String Name;
    public studen(int id,String Name){
        this.id=id;
        this.Name=Name;
    }
}