package subject01__;

import java.util.Scanner;
public class HelixArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入您所需要的Helix Array的行数：");
        int i = s.nextInt();
        System.out.print("请输入您所需要的Helix Array的列数：");
        int i1 = s.nextInt();
        //
        int[][] x = new int[i][i1];
        //
        int k = 1;
        int[] x1 = new int[i* i1];
        //将螺旋矩阵拉直成一个数组
        for (int j = 0; j < i * i1; j++) {
            x1[j] = k;
            k++;
        }
        //按一定顺序排列形成螺旋矩阵（我的理解是将x1折叠）再形成x
        int a, b;
        a = 0;
        int c = 0;

              /*1.当行数为偶数列数也为偶数：
                2.当行数为奇数列数也为奇数：
                3.当行数为偶数列数为奇数：
                4.当行数为奇数列数为偶数：

                                        */

        for (b = 0; b < i1; b++) {
            x[a][b] = x1[c];
            c++;
        }
        b--;
        for (a++; a < i; a++) {
            x[a][b] = x1[c];
            c++;
        }
        a--;
        for (b--; b >= 0; b--) {
            x[a][b] = x1[c];
            c++;
        }
        b++;
        for (a--; a > 0; a--) {
            x[a][b] = x1[c];
            c++;
        }

    for (int j = 0; j < i; j++) {
        for (int j1 = 0; j1 < i1; j1++) {
            System.out.print(x[j][j1] + " ");
        }
        System.out.println("\n");
    }

    }
}