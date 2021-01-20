package subject01__;

import java.util.Scanner;
public class  longlongJieChen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("pelase tell me a number: ");
        int a=s.nextInt();
        CHaojbda(a);
    }
//一些英语单词的记忆:位数 digit
//这一题给了我许多思考与启发
    public static int[] CHaojbda(int a){
        /* 申请一个很jb大的数组（也还好） */
        int[] m = new int[2001000];
        int i=1,z,v;
        m[0]=1;
        int digit=1; int g=0,f = 0;
        for(i++;i<a+1;i++){
            v=0;
            for(int j=0;j<digit;j++){     //难点就在于如何确定digit的大小，
                z=m[j]*i+v;
                m[j]=z%10;
                v=z/10;
            }
            while(v!=0){
                m[digit]=v%10;
                v=v/10;
                digit++;
            }
        }
        for(i=digit-1;i>=0;i--){
            System.out.print(m[i]);
        }//倒序输出每一位
        return longlongjiafa02.ArryDaoXu(m);
    }
}
