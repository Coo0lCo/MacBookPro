import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zzengge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();

        //这里我采用  链表存储 每一个学生对象 （学生对象的内存地址） 循环读取学生的信息  学号 姓名 成绩
        List<studen> l=new LinkedList<>();
        int k=0;
        for(int i=0;i<N;i++){
            studen s=new studen(sc.nextInt(),sc.next(), sc.nextInt());
            if (s.dengji.equals("D"))k++;
            l.add(s);
        }
        System.out.println();
        System.out.println("The count for failed(<60):"+k);
        System.out.println("The grades:");

        for(Object i : l){
            System.out.println(i);
        }
    }
}
// 抽象出来的学生类
class studen{
     int num;
     int score;
     String dengji;
     public void dengjipanduan(int score){
         if(score>=0 && score<=59){
             this.dengji="D";
         }else if(score<=69){
             this.dengji="C";
         }else if(score<=84){
             this.dengji="B";
         }else if(score<=100) {
                this.dengji="A";
         }
     }
    public studen(String dengji){
           this.dengji=dengji;
    }
    //  重写toString方法 格式化输出结果
    public String toString() {
        return num +" " + Name +" " + score + " " +dengji;
    }
    String Name;
    public studen(int num,String Name,int score){
        this.Name=Name;
        this.num=num;
        this.score=score;
        this.dengjipanduan(score);
    }
}
/* 测试用例：
30001 dengchao 99
30002 niubige 55
30003 zhenbucuo 16
 */