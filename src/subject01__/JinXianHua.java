package subject01__;
import java.util.Scanner;
public class JinXianHua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请告诉我您将输入几组数据：");
        int n = sc.nextInt();
        int[] array = new int[n * 2];
        int i;
        for (i = 0; i < n * 2; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        i = 0;
        while (i != array.length) {
            int k = fun(array[i], array[i + 1]);
            if(k==0){
                System.out.println("404 Not Found");
            }else {
                System.out.println(k);
            }
            i = i + 2;
        }
    }
    public static int fun(int a, int b) {
        int f = -1, k = 0, nb2,NUMBER=0;
        int[] number = new int[10];
        for (int i = a; i <= b; i++) {
            nb2 = i;
            while (nb2 >= 10) {
                number[++f] = nb2 % 10;
                nb2 = nb2 / 10;
                k++;
                if (nb2 < 10) {
                    number[++f] = nb2;
                    k++;
                }
            }
            int sum=number[0],chengji=number[0];
            for (int ii = 1; ii < k; ii++) {
                    sum=sum+number[ii];
                    chengji=chengji*number[ii];
            }
            if (sum>=20 && chengji>=162)NUMBER++;
            f = -1;
            k = 0;
        }
        return NUMBER;
    }
}
