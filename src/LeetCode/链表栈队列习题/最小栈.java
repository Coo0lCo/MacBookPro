package LeetCode.链表栈队列习题;

public class 最小栈 {
    int rear=-1;
    Object[] number=new Object[2000];
    int head;
    int minNumber;
    public 最小栈(){

    }
    public void push(int x) {
        if(rear==-1){
            number[++rear]=x;
            minNumber=x;
        }else{
            number[++rear]=x;
            if (x<minNumber)minNumber=x;
        }
    }
    public void pop() {
        number[rear--]=null;
    }
    //注意 这里有可能会把最小 的值给弹出去了
    public int top() {
        if(rear==-1){
           return -1;
        }
        int min= (int) number[rear];
        number[rear]=null;
        if(minNumber==min){
            for(int i=this.head;i<=rear;i++){
                if ((int)number[i]<minNumber){
                    minNumber=(int)number[i];
                }
            }
        }
        rear--;
        return min;
    }
    public int getMin() {
        return minNumber;
    }
}
