package subject01__;
import java.util.Scanner;
public class calculation__alternatingcurrent {
    public static void main(String[] args) {
        /*这一题需要对复数知识有一定了解
          复数定义（回忆一下）：Z=a+bi
                   （Z:即为复数，a：实部，b:虚部，i为虚数单位）
         */
        int[] array1=new int[2];
        Scanner sc1=new Scanner(System.in);
        System.out.print("请输入电压值的实部和虚部（空格间隔开）：");
        for(int i=0;i<2;i++){
            int sx1= sc1.nextInt();
            array1[i]=sx1;
        }
        int[] array2=new int[2];
        Scanner sc2=new Scanner(System.in);
        System.out.print("请输入阻抗值的实部和虚部（空格间隔开）：");
        for(int j=0;j<2;j++){
            int sx2= sc2.nextInt();
            array2[j]=sx2;
        }
        int a=array1[0];int b=array1[1];
        int c=array2[0];int d=array2[1];
        double ac_bd=(a*c)+(b*d),bc_ad=(b*c)-(a*d),cc_dd=(c*c)+(d*d);
        double shibu=ac_bd/cc_dd;double xubu=bc_ad/cc_dd;
        System.out.printf("%.2f %.2f",shibu,xubu);
    }
}
