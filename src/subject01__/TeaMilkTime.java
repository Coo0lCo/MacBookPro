package subject01__;

import java.util.Scanner;
public class TeaMilkTime {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.print("学姐请你告诉我当前时间：");
        String str1=sc1.next();
        Scanner sc2=new Scanner(System.in);
        System.out.print("学姐请你告诉我你期望的睡眠时间：");
        String str2=sc2.next();
        Scanner sc3=new Scanner(System.in);
        System.out.print("学姐请你告诉我这杯奶茶的清醒时间：");
        String str3=sc3.next();
        int h1,h2,h3,min1,min2,min3;
        h1=Stringtonumber(str1,0);
        min1=Stringtonumber(str1,3);
        h2=Stringtonumber(str2,0);
        min2=Stringtonumber(str2,3);
        h3=Stringtonumber(str3,0);
        min3=Stringtonumber(str3,3);
        int JianGeTime=h_min(h1,min1,h2,min2);
        int QinxingTime=min(h3,min3);
        boolean x=QinxingTime>JianGeTime;
        if(x){
            System.out.println("Hair Loss Warning");
        }else{
            int k=(JianGeTime/QinxingTime)*QinxingTime;
            int h=k/60;
            int min=k-(h*60);
            h1=h1+h;
            if((min1+min)>=60){
                h1=h1+((min1+min)/60);
                min1=(min1+min)-((min1+min)/60);
                if(h1<10){
                    if(min1<10) {
                        System.out.printf("0%d:0%d", h1,min1);
                    }else {
                        System.out.printf("0%d:%d",h1, min1);
                    }
                }else{
                    if(min1<10) {
                        System.out.printf("%d:0%d", h1, min1);
                    }else {
                        System.out.printf("%d:%d",h1 , min1);
                    }
                }
            }else{
                min1=min1+min;
                if(h1<10){
                    if(min1<10) {
                        System.out.printf("0%d:0%d", h1,min1);
                    }else {
                        System.out.printf("0%d:%d",h1, min1);
                    }
                }else{
                    if(min1<10) {
                        System.out.printf("%d:0%d", h1, min1);
                    }else {
                        System.out.printf("%d:%d",h1 , min1);
                    }
                }
            }
        }
    }
    /**
     * h_min:用于计算两个24小时制下的时间相隔多少分钟。
     * @param h1:为起始时间的小时
     * @param min1:为起始时间的分钟
     * @param h2:为终止时间的小时
     * @param min2:为终止时间的分钟
     * @return
     */
    public static int h_min(int h1,int min1,int h2,int min2){
        int h_min;
        h_min=(h2-h1)*60;
        if(min1>min2){
            h_min=h_min-(min1-min2);
        }else{
            h_min=h_min+(min2-min1);
        }
        return h_min;
    }
    /**
     * 将该时间段用min表示
     * @param h：小时
     * @param min：分钟
     * @return
     */
    public static int min(int h,int min){
        return (h*60)+min;
    }
    /**
     * 指定字符串中的某个字符转成数字。
     * @param str
     * @param digit
     * @return
     */
    public static int Stringtonumber(String str,int digit){
        int a,b,c;
        a=(str.charAt(digit)-'0');
        b=(str.charAt(digit+1)-'0');

        return a*10+b;
    }
}
/*
08:07
22:03
03:55
 */