package subject01__;
import java.io.*;
import java.util.Scanner;
public class ShuHaodemimi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1="",str2="";
        while (!sc.hasNext("EOF")) {
            String str= sc.next();
            str1=str;
            str2=str2+str1;
        }
        //System.out.println(str2);
        int i=0,j=0,h=-1,numberlength=0;
        boolean b=true;
        while (b){
            i++;
            int a=(10*i)+(3*i);
            if(a==str2.length()){
                numberlength=10*i;
                b=false;
            }
        }
        int[] number=new int[numberlength];
        for(i=0;i<str2.length();i++){
            if(str2.charAt(i)=='-'){
                for(int k=j;k<i;k++){
                    number[++h]=str2.charAt(k)-'0';
                }
                j=i+1;
            }
        }
        number[numberlength-1]=str2.charAt(str2.length()-1)-'0';
        int sum=0;
        int kk=0;
        while (kk!=number.length){
            j=1;
            for(i=kk;i<kk+10;i++){
                sum=sum+(j*number[i]);
                j++;
            }
            if(sum%11==number[kk+9]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            kk=i;
        }
    }
}
/*
样例输入：
7-5063-2529-2
7-1973-2073-9
7-4396-7777-7
 */

/*
样例输出：



 */


