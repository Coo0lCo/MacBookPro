package subject01__;
import java.util.Scanner;
public class YuanYuanGuiGui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("请输入三个浮点参数r,a,b:");
        double[] rab=new double[3];
        for(i=0;i<3;i++){
            double number= sc.nextDouble();
            rab[i]=number;
        }
        double r=rab[0],a=rab[1],b=rab[2];
        //圆的周长C
        double C=3.1415926*2*r;
        //圆的面积
        double S=3.1415926*r*r;
        //球体积
        double V=1.3333333*3.1415926*r*r*r;
        //椭圆面积
        double tuoyuanS=3.1415926*a*b;

        System.out.printf("%.2f %.2f %.2f %.2f",C,S,V,tuoyuanS);
    }
}
