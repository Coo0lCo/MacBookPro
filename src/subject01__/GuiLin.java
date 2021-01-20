package subject01__;
import java.util.Scanner;
public class GuiLin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入四个正整数分别表示a,b,x,y:");
        int i;
        int[] number=new int[4];
        for (i=0;i<4;i++){
            int nb= sc.nextInt();
            number[i]=nb;
        }
        int a=number[0],b=number[1],x=number[2],y=number[3];
        int n1,n2;
                //对a，b分情况为3种
                int max=cmp.Max(a,b),min=cmp.Min(a,b);
                if(a>0 && b>0){
                    int[] dl1=new int[2];
                    dl1[0]=((max-min)*x)+(min*y);
                    dl1[1]=(a+b)*x;
                    System.out.println(cmp.Min(dl1[0],dl1[1]));
                }
                if(a<0 && b<0){
                    int[] dl2=new int[2];
                    dl2[0]=((max-min)*x)-(max*y);
                    dl2[1]=-((a+b)*x);
                    System.out.println(cmp.Min(dl2[0],dl2[1]));
                }
                if(a<0 && b>0){
                    int[] dl3=new int[2];
                    dl3[0]=((max+min)*x)+((-min)*y);
                    dl3[1]=((-a)+b)*x;
                    System.out.println(cmp.Min(dl3[0],dl3[1]));
                }
                if(a>0 && b<0){
                    int[] dl4=new int[2];
                    dl4[0]=(((-max)-min)*x)+(max*y);
                    dl4[1]=(a-b)*x;
                    System.out.println(cmp.Min(dl4[0],dl4[1]));
                }
                if(a==0 && b!=0){
                    if(b>0){
                        System.out.println(x*b);
                    }else{
                        System.out.println(-(x*b));
            }
        }
        if (a!=0 && b==0){
            if(a>0){
                System.out.println(x*a);
            }else{
                System.out.println(-(x*a));
            }
        }
    }
}
