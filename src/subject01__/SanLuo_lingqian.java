package subject01__;
import java.util.Scanner;
public class SanLuo_lingqian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个正整数（表示一元硬币个数）：");
        int n= sc.nextInt();
        int[] number=new int[n];
        int i;
        for(i=0;i<n;i++){
            number[i]=1;
        }
        for(i=0;i<n;i++) {
            System.out.print(number[i]+" ");
        }
    }
}
