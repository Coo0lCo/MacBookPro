package subject01__;
import java.util.Scanner;
public class XiangShangQuZheng {
    public static void main(String[] args) {
        System.out.print("请输入两个正整数：");
        Scanner sc=new Scanner(System.in);
        int[] ab=new int[2];
        int i;
        for(i=0;i<2;i++){
            int number= sc.nextInt();
            ab[i]=number;
        }
        double a=ab[0],b=ab[1];
        double a_b=a/b;
        int a__b=(int)(a/b);
        System.out.printf("%d",a__b+1);
    }
}
