package subject01__;

import java.util.*;
public class 小翔哥 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("小翔哥请告诉我你吃了几根冰棍：");
        int a=input.nextInt();
        System.out.print("小翔哥请告诉我你的冰棍多少钱一根：");
        Double i=input.nextDouble();
        double k=0;
        k=a*i;
        int s=(int)k;
        double n=k-s;
        System.out.printf("恭喜小翔哥省下了：%.2d元",n);
    }
}
