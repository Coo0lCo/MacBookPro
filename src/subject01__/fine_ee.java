package subject01__;

import java.util.Scanner;

public class fine_ee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("输入：");
        int number=s.nextInt();
        int[] enumber=new int[1000];
        boolean panduan=true;
        int e=2,h=-1;
        int fai=number;
        do {
            e++;
            for(int i=2;i<e;i++){
                if(e%i==0 && fai%i==0){
                    panduan=false;
                }
            }
            if (panduan)enumber[++h]=e;
            panduan=true;
        }while (e!=fai);
        for(int i=0;i<enumber.length;i++){
            if(enumber[i]==0)break;
            System.out.println(enumber[i]+" ");

        }
    }
}
