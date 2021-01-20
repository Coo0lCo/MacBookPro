package subject01__;
import java.util.Scanner;
public class XieJuzhen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入此数组的长度（长度与宽度相等）：");
        int n = s.nextInt();
        int a, b, c,d;    //a:行数     b：列数
        a = 0;
        b = n - 1;
        c = 1;
        d=n*n;
        int[][] x = new int[n][n];
        x[a][b] = c;              //右上角起始都为 1
        for(b--;b>=0;b--){
            int y=b;
        x[a][b] = ++c;          //数组越界！！
        while (b != n - 1) {
            a++;
            b++;
            x[a][b] = ++c;        // 假设n=5，[0][3]=2，[1][4]=3,[0][2]=4,[1][3]=5.......以此类推
        }
      a=0;
      b=y;
    }
        a=n-1;
        b=0;
        x[a][b]=d;
       for(b++;b<n-1;b++){
           int y1=b;
           x[a][b]=d--;
                while(b!=0){
                    a--;
                    b--;
                    x[a][b]=d--;
                }
                a=n-1;
                b=y1;
        }
        ErWeishuchu.ErWeiShuChu(n,n,x);
    }
}
