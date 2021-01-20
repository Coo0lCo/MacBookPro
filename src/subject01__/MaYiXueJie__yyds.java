package subject01__;
import java.util.Scanner;
public class MaYiXueJie__yyds {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("麻衣学姐听说你想做炒饭给我吃，我想知道你放了多少种配料呀！！：");
        int number = sc1.nextInt();

        int[] array = new int[number];

        Scanner sc2 = new Scanner(System.in);
        System.out.print("麻衣学姐能告诉我你每一种配料的用量吗（每种配料用量之间用空格分开哦）：");
        for (int i = 0; i < number; i++) {
            int sx1 = sc2.nextInt();
            array[i] = sx1;
        }
        BiuBiu BB=new BiuBiu(array,number);
        int xinxiandu=BB.Meiweidu(array,number);
        System.out.println(xinxiandu);
    }
}
 class BiuBiu {
    int number;
    int[] arraybiubiu=new int[number];
    public  int Meiweidu(int x[], int a) {
        if (a==0) {
            return 0;
        } else {
            return (this.number+ 1 - a) * x[a-1]+ Meiweidu(this.arraybiubiu,a-1);//未完成
        }
    }
    public  BiuBiu(int x[],int a){
        this.number=a;
        this.arraybiubiu=x;
    }
}