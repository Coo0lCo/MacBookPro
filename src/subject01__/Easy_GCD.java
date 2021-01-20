package subject01__;
import java.util.Scanner;
public class Easy_GCD {
    public static void main(String[] args) {
        System.out.print("请输入两个数：");
        Scanner sc=new Scanner(System.in);
        int[] ab=new int[2];
        int i;
        for(i=0;i<2;i++){
            int number= sc.nextInt();
            ab[i]=number;
        }
        int a=ab[0],b=ab[1];
        int k;
        for(k=2;;k++){
            int gcd1=a%(k);
            int gcd2=b%(k);
            if(gcd1==0 && gcd2==0){
               System.out.println(k);
                break;
            }
        }
    }
}
