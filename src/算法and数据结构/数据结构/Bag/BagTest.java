package 算法and数据结构.数据结构.Bag;

import java.util.Queue;
import java.util.Stack;

public class BagTest {
    public static void main(String[] args) {
        //这里我们用Bag背包的机制去存储我的对象，（抽象数据类型）
        teatcher t1=new teatcher("张三",999,1);
        teatcher t2=new teatcher("李四",998,0);
        teatcher t3=new teatcher("王五",997,1);
        teatcher t4=new teatcher("李二蛋",996,0);
        teatcher t5=new teatcher("赵铁柱",995,1);
        Stack<teatcher> s=new Stack<teatcher>();

        s.push(t2);
        s.push(t1);
        s.push(t3);
        s.push(t4);
        s.push(t5);
        //李永杰for(foreach)语句可以迭代输出 对象（可重写toString 进而格式化输出数据）
        for (teatcher i : s){
            System.out.println(i);
        }
    }
}
class teatcher{
    private String Name;
    private int Id;
    private int sex;

    public teatcher(String Name,int Id,int sex){
        this.Name=Name;
        this.Id=Id;
        this.sex=sex;
    }
    @Override
    public String toString() {
        return "姓名："+this.Name+" Id:"+this.Id+" 性别（男1女0）："+this.sex;
    }
}