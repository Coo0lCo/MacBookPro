package 算法and数据结构.经典算法.冒泡排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a={112,432,2,5,12,1,4};
        long aa=System.currentTimeMillis();
        a=do排序(a);
        long aaa=System.currentTimeMillis();
        System.out.println(aaa-aa);
        for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
        }
    }
    public static int[] do排序(int x[]){
        for (int j = 0; j < x.length-2; j++) {
            for (int i = 0; i < x.length-1; i++) {
                if (x[i]>x[i+1]){
                    int k=x[i];
                    x[i]=x[i+1];
                    x[i+1]=k;
                }
            }
        }
        return x;
    }
    public static int[] do排序1(int x[]){
        for (int j = x.length-1; j > 0; j--) {
            for (int i = 0; i <j; i++) {
                if (x[i]>x[i+1]){
                    int k=x[i];
                    x[i]=x[i+1];
                    x[i+1]=k;
                }
            }
        }
        return x;
    }
    //冒泡的核心就是：内层循环选择出当前外层循环n次时的最大值，并循环这样的操作x.length-2次（也就是挨个冒泡   由大到小冒泡）
}
