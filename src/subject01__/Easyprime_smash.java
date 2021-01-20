package subject01__;
import java.util.Scanner;
public class Easyprime_smash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请告诉我初始数字的位数：");
        int digit=sc.nextInt();
        System.out.print("请输入一个倒序的数据（个位为第一个数字，并且每一位之间空格隔开：");
        int[] number=new int[digit];
        int i;
        for(i=0;i<digit;i++){
            int nb=sc.nextInt();
            number[i]=nb;
        }
        int x=number[0];
        int a=x%2,b=x%5;
        int c=x/2,d=x/5;
        int e=c%2,f=c%5,g=d%2,h=d%5;
        int sum=0;
        if( (a==0 || b==0) && ((e==0 || f==0)||(g==0 || h==0)) ){
            System.out.println("Smash it with ");
                    for(int j=0;j<digit;j++){
                        sum=sum+number[j];
                    }
                  if (sum%3==0 && ((sum/3)%3==0)){


                  }
        }else{




        }
    }












/*
    public static int[] jiaduan(int x[]){
        int[] san=new int[]

    }

 */
}
