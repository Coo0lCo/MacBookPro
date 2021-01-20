package subject01__;
import java.util.Scanner;
public class YouDian2 {
    public static void main(String[] args) {
        int[] array=new int[3];
        Scanner sc2 = new Scanner(System.in);
        System.out.print("请输入三个数：");
        for (int i = 0; i <3; i++) {
            int sx1 = sc2.nextInt();
            array[i]=sx1;
        }
        int min=array[0],max=array[0];
        for(int i=1;i<3;i++){
            if (min>array[i])min=array[i];
            if (max<array[i])max=array[i];
        }
        for (int j=0;j<3;j++){
            if(array[j]<max && array[j]>min){
                System.out.println(array[j]);
            }
        }
    }
}
