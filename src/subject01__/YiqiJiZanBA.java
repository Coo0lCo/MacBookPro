package subject01__;

import java.util.Scanner;

public class YiqiJiZanBA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入n,m：");
        int[] number=new int[2];
        for (int i = 0; i < 2; i++) {
            int n=sc.nextInt();
            number[i]=n;
        }
        int n=number[0],m=number[1];

        if(n>=m){
            System.out.print("Wow! Delicious ^_^");
        }else {
            System.out.print("同学你还需要赞"+(m-n)+"赞哦！！");
        }
    }
}
