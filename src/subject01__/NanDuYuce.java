package subject01__;
import java.util.Scanner;
public class NanDuYuce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入六个整数（必须为1-9之间的数字）：");
        int i;
        int[] yucenandu=new int[6];
        int[] shijinandu=new int[6];
        for(i=0;i<6;i++){
            int number1= sc.nextInt();
            yucenandu[i]=number1;
        }
        System.out.print("请输入六个整数（必须为1-9之间的数字）：");
        for(i=0;i<6;i++){
            int number2= sc.nextInt();
            shijinandu[i]=number2;
        }

        //实际上这一题的考点在于   两个数组的
        int k=0;
        for (i=0;i<6;i++){
            if(yucenandu[i]==shijinandu[i])k++;
        }
        System.out.println(k);
    }
}
