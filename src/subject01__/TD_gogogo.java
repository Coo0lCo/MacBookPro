package subject01__;

import java.util.Scanner;

public class TD_gogogo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请告诉我是第几个学期：");
        int n=sc.nextInt();
        for (int i = 1; i <=n*48 ; i++) {
            System.out.print("TD ");
        }

    }
}
