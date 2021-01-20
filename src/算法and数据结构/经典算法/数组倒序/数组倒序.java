package 算法and数据结构.经典算法.数组倒序;

public class 数组倒序 {
    public static void main(String[] args) {
        int x[]=new int[]{1,2,3,4,5,6,7,8,9,};
        倒序(x);
    }
    public static int[] 倒序(int x[]){
        int N=x.length;
        for (int i = 0; i < N/2; i++) {
            int temp=x[i];
            x[i]=x[N-1-i];
            x[N-1-i]=temp;
        }
        return  x;
    }
}
