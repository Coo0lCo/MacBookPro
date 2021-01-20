package subject01__;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class fractioncalculation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("please tell me how many dogs are there:");
        int dogenumber=s.nextInt();
        System.out.print("\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("please dogs fraction calculation:");
        int[] array=new int[dogenumber];
        //获得了这群狗给汪吉的分数
        for(int i=0;i<dogenumber;i++){
            int fration=sc.nextInt();
            array[i]=fration;
        }
        //先找到最最高分与最低分的位置。
        int pmax=0,pmin=0;//  表示最高分与最低分在数组中的位置
        int max=array[0],min=array[0];
        for(int j=1;j<dogenumber;j++){
            if(max<=array[j]){
                max=array[j];
            }
            if(min>=array[j]){
                min=array[j];
            }
        }
        int newfarctionArray=0;
        //用于存放不存在最大值和最小值的分数
        for(int m=0;m<dogenumber;m++){
            if(array[m]==max | array[m]==min)newfarctionArray++;
        }
        if(dogenumber==newfarctionArray){
            System.out.println("#DIV/01");
        }else{
            int[] m=new int[dogenumber-newfarctionArray];
            //筛选并存放。
            int r1=-1;
            for (int a=0;a<dogenumber;a++){
                if(array[a]!=max && array[a]!=min) {
                    m[r1+=1] = array[a];
                }
            }
            double sum=0;
            for(int b=0;b<m.length;b++){
                sum=sum+m[b];
            }
            double average=sum/(dogenumber-newfarctionArray);
            System.out.printf("%.2f",average);
        }
    }
}
