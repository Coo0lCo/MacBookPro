package subject01__;

public class SXH {
    public static void main(String[] args) {
            java.util.Scanner s = new java.util.Scanner(System.in);
            System.out.print("请输入一个正整数N（3=<N<=7）：");
            int N = s.nextInt();
            int a[] = new int[N];
            int sum = 0;
            for (int nb = (int) Math.pow(10, N - 1) ; nb < Math.pow(10,N); nb++) {
                for (int j = 0; j <= N-1; j++) {
                    sum = 0;
                    a[j] = (int) (nb / Math.pow (10, j) % 10);
                }
                    for (int k = 0; k <= N - 1; k++) {
                        sum+= (int) Math.pow(a[k], N);
                   }
                    if (sum == nb) System.out.println(nb);
            }
    }
}
