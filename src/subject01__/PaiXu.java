package subject01__;
import java.util.Scanner;
public class PaiXu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一组数字（以EOF结尾）:");
        String str= sc.nextLine();
        int[] number=new int[str.length()];
        int i;
        for(i=0;i<number.length;i++){
            number[i]=str.charAt(i)-'0';
        }
        boolean k=false;
        for(i=1;i<number.length-1;i++){
            if(number[i]>=number[i-1] && number[i]<=number[i+1]){
                k=true;
            }else{
                System.out.print("No");
                k=false;
                break;
            }
        }
        if(k) System.out.println("Beautiful");
    }
}
