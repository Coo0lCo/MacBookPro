package subject01__;
import java.util.Scanner;
public class shishsishs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[6];
        for(int i=0;i<6;i++){
            int x=sc.nextInt();
            array[i]=x;

        }

        for(int j=0;j<6;j++){
            System.out.print(array[j]+" ");
        }


    }
}
