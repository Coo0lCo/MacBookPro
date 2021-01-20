package subject01__;

import java.util.HashMap;
import java.util.Scanner;

public class AiChenBiJiaXi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个正整数N:");
        int N= sc.nextInt();
        int A=0,B=1,C;
        int t=0;





        /*
            先定C，后A,B循环增加
            之后再C循环增加或者减小
         */
        for(C=0;C<N;C++){
                for(A=0;A<N;A++) {
                    for (B = 1; B < N; B++) {
                        int nn = (A * B) + C;
                        if (N == nn) {
                            t++;
                        }
                    }
                }
        }
        System.out.println(t);
    }
}
