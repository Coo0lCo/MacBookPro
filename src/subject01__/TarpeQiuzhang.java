package subject01__;
import java.util.Scanner;
public class TarpeQiuzhang {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入资本和回报率：");
        double[] array=new double[2];
        for(int i=0;i<2;i++){
            double x= sc1.nextDouble();
            array[i]=x;
        }
        double a=array[0],c=array[1]/100;
        double b1=a*c;
        double b=a+b1;
        System.out.printf("%.2f",b);
    }
}
