package subject01__;
import java.util.Scanner;
public class BiHua {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.print("请告诉我有几个小朋友：");
        int number1= sc.nextInt();
        int[] array=new int[number1*2];
        //如何没输入两次换行并且存储进数组
        int i;
        for(i=0;i<number1*2;i++){
            int x=sc.nextInt();
            array[i]=x;

        }



        //壁画的长度即为最大值减去最小值
        int min=array[0],max=array[0];
        for(i=0;i<number1*2;i++){
            if (min>array[i])min=array[i];
            if (max<array[i])max=array[i];
        }

        System.out.println(max-min);
    }


}
//     889 ms  <1000ms
/*
           尽量多实现变量的复用，避免定义过多的变量而增加时间复杂度
 */
/*
5 10
12 15
14 20

 */
