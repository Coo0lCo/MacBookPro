package subject01__;

import java.util.Scanner;

public class SuShuPanDing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n= sc.nextInt();
        boolean panduan=true;
        int i;
        for(i=2;i<n;i++){
            if(n%i==0)panduan=false;
        }
        if(panduan){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
