package subject01__;
import java.util.Scanner;
public class BlueFly {
    public static void main(String[] args) {
        int[] array=new int[3];
        Scanner sc2 = new Scanner(System.in);
        System.out.print("请输入第一天发的糖，和明天比今天多发几颗糖，以及发了多少天：");
        for (int i = 0; i <3; i++) {
            int sx1 = sc2.nextInt();
            array[i]=sx1;
        }
        int n=array[0],m=array[1],k=array[2];
        if(k==1){
            System.out.println(n);
        }else{
            int tangguoshuliang=tangguoshu(n,m,k);
            System.out.println(tangguoshuliang);
        }
    }
    public static int tangguoshu(int n,int m,int k){
        if (k==0){
            return 0;
        }else{
            return n+m+tangguoshu(n+m,m,k-1);
        }
    }
}
