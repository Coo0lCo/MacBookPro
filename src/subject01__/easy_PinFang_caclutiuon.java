package subject01__;
import java.util.Scanner;
public class easy_PinFang_caclutiuon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入n表示有几个数据：");
        int n= sc.nextInt();
        int[] number=new int[n];
        int i;
        System.out.print("输入你的数据（空格隔开）：");
        for(i=0;i<n;i++){
            int nb= sc.nextInt();
            number[i]=nb;
        }
        int pfhe=0,sum=0;
        for(i=0;i<n;i++){
            pfhe=pingfang(number[i]);
            sum=pfhe+sum;
        }
        System.out.println(sum);
    }
    public static int pingfang(int a){
        return a*a;
    }
}
