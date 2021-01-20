package subject01__;
import java.util.Scanner;
public class PRNG {
    public static void main(String[] args) {
        int[] array=new int[4];
        Scanner sc1=new Scanner(System.in);
        System.out.print("请输入四个正整数分别代表m,a,c,:");
        for(int i=0;i<4;i++){
            int x= sc1.nextInt();
            array[i]=x;
        }
        long m=array[0],a=array[1],c=array[2],Seed=array[3];
        long[] suijishuArray=new long[50000];

        for(int i=0;i<50000;i++){
            long suijishu=((Seed*a)+c)%m;
            suijishuArray[i]=suijishu;
            Seed=suijishu;
        }
        boolean nb=true;
        for1:for(int j=0;j<50000;j++){
            for2:for (int jj=j+1;jj<50000;jj++){
                if(suijishuArray[j]==suijishuArray[jj]){
                    System.out.println("Duplicate found");
                    System.out.printf("%d %d",suijishuArray[j],jj+1);
                    nb=false;
                    break for1;
                }
                if (suijishuArray[j]==suijishuArray[jj])break for2;
            }
        }
        if(nb){
            System.out.println("Not repeated");
            System.out.print(suijishuArray[49999]);
        }
    }
}

