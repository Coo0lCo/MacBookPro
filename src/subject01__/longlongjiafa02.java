package subject01__;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;
public class longlongjiafa02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("please input a very JB Da Number：");
        String str1 = s1.next();
        //*******我的意思就是：我输进去的数很jb大，那我只能接收字符串（有没有可能直接接收数组）
        Scanner s2 = new Scanner(System.in);
        System.out.print("please input anther very JB Da Number：");
        String str2 = s2.next();

        int[] number1 = new int[str1.length()];
        int[] number2 = new int[str2.length()];

        for (int i = 0; i < number1.length; i++) {
            number1[i] = str1.charAt(i) - '0';
        }

        for (int j = 0; j < number2.length; j++) {
            number2[j] = str2.charAt(j) - '0';
        }

        int[] n = new int[number1.length];
        int[] m = new int[number2.length];
        n = ArryDaoXu(number1);
        m = ArryDaoXu(number2);

        int JinY = 0;
        int u1, u2, H = 0;

        int[] sum = new int[Max(n.length, m.length) + 1];
        //int[] sum=new int[2000000000];i
        int z;
        for (int r = 0; r < Min(number1.length, number2.length); r++) {
            u1 = n[r] + m[r] + JinY;

            if (u1 >= 10) {
                sum[H++] = u1 % 10;
                z = 1;
            } else {
                sum[H++] = u1;
                z = 0;
            }

            if(r==Min(number1.length, number2.length)-1){
                JinY=0;
                for(int v=r;v<Max(number1.length,number2.length);v++){
                        u2= n[r] + m[r] + JinY;
                        if(u2>10){
                            sum[H++]=u1%10;
                            z=1;
                    }else{
                            sum[H++]=u1;
                            z=0;
                        }
                }
            }
        }
        putArry(ArryDaoXu(sum));
    }


    public static void putArry(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
        System.out.print("\n");
    }

    //取较小的那个变量
    public static int Min(int a,int b){
        if (a>=b){
            return b;
        }else{
            return a;
        }

    }
    //取较大的那个变量
    public static int Max(int a,int b){
        if (a>=b){
            return a;
        }else{
            return b;
        }

    }

    public static int[] ArryDaoXu(int x[]){
        int[] a=new int[x.length];
        int i=x.length-1,j=0;
        while (i!=-1 ){
            a[j]=x[i];
            j++;
            i--;
        }
        return a;
    }
}
