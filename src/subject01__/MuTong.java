package subject01__;
import java.util.Scanner;
public class MuTong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请告诉我木板的个数以及木桶的半径：");
        //获得木板的个数和木桶的半径
        int i;
        int[] number_radius=new int[2];
        for(i=0;i<2;i++){
                int x= sc.nextInt();
                number_radius[i]=x;
        }
        int number=number_radius[0],radius=number_radius[1];
        //获取第二行n个整数:
        int[] length=new int[number_radius[0]];
        for( i=0;i<number_radius[0];i++){
                int x1= sc.nextInt();
                length[i]=x1;
        }
        int min=length[0];
        for(i=1;i<number_radius[0];i++){
            if (min>length[i])min=length[i];
        }
        int k=0;
        int[] length1=new int[number_radius[0]-1];
        for(i=0;i<number_radius[0];i++){
            if(length[i]!=min){
                    length1[k]=length[i];
                    k++;
            }
        }
        int min1=length1[0];
        for(i=0;i<number_radius[0]-1;i++) {
                if (min1>length1[i])min1=length1[i];
        }
        int r=number_radius[1]*number_radius[1];
        double v=3.1415*r*min1;
        System.out.printf("%.4f",v);
    }
}
//1 2 2 2 2 2 2 2 2 4