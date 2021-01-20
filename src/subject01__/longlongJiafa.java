package subject01__;

import java.util.Scanner;
public class longlongJiafa {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("请输入第一个高位数(数字与数字之间用空格分开):");
        String str1=s1.nextLine();

        Scanner s2=new Scanner(System.in);
        System.out.print("请输入的二个高位数(数字与数字之间用空格分开):");
        String str2=s2.nextLine();

        String arr1[]= str1.split(" ");
        String arr2[]=str2.split(" ");

        int[] n=new int[arr1.length];
        int[] m=new int[arr2.length];

        int k1= arr1.length-1,k2= arr2.length-1;
        // str1------>n[]
        for(int i=0;i< arr1.length;i++){
            n[k1]=Integer.parseInt(arr1[i]);
            k1--;
        }

        // str2------>m[]
        for(int j=0;j< arr2.length;j++){
            m[k2]=Integer.parseInt(arr2[j]);
            k2--;
        }

        //上述步骤将输入的字符串转换成整数之后分别存入了两个数组中

        int[] sum=new int[Max(arr1.length, arr2.length)+1];      //2147483647为数组最大的存储单位

        int u1,u2;
        int H=0,z=0;
        //用于计算两个数作加法过后所占的长度
        int nm=0;


        //xxx.length ：是用于计算xxx此字符串占有多少个单位
        int q;

        int p=Max(arr1.length, arr2.length);
        int p1=p-Min(arr1.length, arr2.length);

        for(q=0;q<Min(arr1.length, arr2.length)-1;){
            u1=(n[q]+m[q])+z;
            u2=n[q++]+m[q++];

                if(u1>10){
                    sum[H]= u1%10;
                    z=u1/10;
                    u2=u2+z;

                    if (u2>10){
                        sum[H++]=u2%10;
                    }else {
                        sum[H++]=u2;
                    }

                }else{

                }
                //----------------------------------------------

                if(q==Min(arr1.length, arr2.length)-1){
                    if(u2>10){
                        sum[H++]=u2%10;
                        if(arr1.length==arr2.length){
                                sum[H++]=u2/10;
                                ShuChu(sum);
                                break;
                        }
                    }else {
                        sum[H++] = u2;
                        if (arr1.length == arr2.length) {
                            sum[H++] = u2 / 10;
                            ShuChu(sum);
                            break;
                        } else{
                            for (int t = q; q < p - 1; q++) {
                                if (arr1.length > arr2.length) {
                                    sum[H++] = n[q];
                                } else {
                                    sum[H++] = m[q];
                                }
                            }
                    }
                    }
                }

                //----------------------------------------------------
        }



        if(arr1.length!=arr2.length){
            ShuChu(sum);
        }

    }
    //取较小的那个变量
    public static int Min(int a,int b){
            if (a>=b){
                   return b;
            }else{
                return a;
            }

    }
    public static int Max(int a,int b){
        if (a>=b){
            return a;
        }else{
            return b;
        }

    }
    //遍历数组
    public static void ShuChu(int x[]){
        for(int i=x.length-1;i!=0;i--){
            System.out.print(x[i]);
        }
    }
}