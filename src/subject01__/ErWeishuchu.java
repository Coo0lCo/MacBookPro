package subject01__;

public class ErWeishuchu {
    public static void ErWeiShuChu(int i,int i1,int x[][]){
        for (int j = 0; j < i; j++) {
            for (int j1 = 0; j1 < i1; j1++) {
                System.out.printf("%4d",x[j][j1]);
            }
            System.out.print("\n");
        }
    }
}
