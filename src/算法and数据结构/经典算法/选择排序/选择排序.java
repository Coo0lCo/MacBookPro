package 算法and数据结构.经典算法.选择排序;

public class 选择排序 {
    public static void main(String[] args) {
        int[] a={112,432,2,5,12,1,4};
        do选择排序(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int[] do选择排序_(int x[]){
        for (int i = 0; i <x.length-2 ; i++) {
            for (int j = x.length-1; j >i ; j--) {
                if (x[j]<x[j-1]){
                    int k=x[j-1];
                    x[j-1]=x[j];
                    x[j]=k;
                }
            }
        }
            return x;
    }
    public static  void do选择排序(int x[]){
        int min,k = 0;
        for (int i = 0; i < x.length-1; i++) {
                min=i;
            for (int j =i+1; j < x.length; j++) {
                if (x[min]>x[j]) {
                    k = x[min];
                    x[min] = x[j];
                    x[j] = k;
                    }
                }
            }
        }
        //选择排序比冒泡排序更加快
    }

