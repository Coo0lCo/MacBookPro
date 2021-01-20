package subject01__;
import java.util.Scanner;
public class JianFei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数表示蛋糕的形状（3代表三角形，4代表正方形）：");
        int xz= sc.nextInt();
        int[] ab=new int[2];
        int i;
        if(xz==3){
            System.out.print("请输入一个正整数表示蛋糕层数：");
            int cs= sc.nextInt();
            System.out.print("请输入一个正整数m表示学姐能吃蛋糕的最大面积：");
            int m=sc.nextInt();
            if(SanJiaodangao(cs)<=m){
                System.out.println("ENJOY YOUR MEAL!");
            }else {
                System.out.println("FBI WARNING!");
            }
        }else if (xz==4){
            System.out.print("请输入a，b分别表示蛋糕层数以及每层的长度：");
            for(i=0;i<2;i++){
                int number= sc.nextInt();
                ab[i]=number;
            }
            System.out.print("请输入一个正整数m表示学姐能吃蛋糕的最大面积：");
            int m=sc.nextInt();
            if(ZhenFanxingdangao(ab[0],ab[1] )<=m){
                System.out.println("ENJOY YOUR MEAL!");
            }else {
                System.out.println("FBI WARNING!");
            }
        }
    }
    //计算三角形蛋糕的面积
    public static int SanJiaodangao(int a){
        int a1=1;
        int an=(2*a)-1;
        return ((a1+an)*a)/2;
    }
    //计算正方形蛋糕的面积
    public static int ZhenFanxingdangao(int a,int b){
           return a*b;
    }
}
