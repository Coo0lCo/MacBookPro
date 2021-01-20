package 算法and数据结构.经典算法.二分法查找;

public class 二分法查找 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,67,23,8,9,11,5,66,88,144,24,546};
        ArraysSearch(a,88);
        System.out.println(ArraysSearchWhile(a,88));

        int[] nums=new int[10];
        int i = 0;
        int j = i + 1;
        nums[i + 1] = nums[j];

    }
    //通过二分法查找  效率更高  但是二分法只适用于已经排好序的基础之上
    //以下我用了递归和while循环两种实现方式   当然递归会比较麻烦在这里   while比较舒服的
    public static int ArraysSearchWhile(int[] x,int a){
        boolean k=true;
        int N=x.length/2;
        while (k){
            if(x[N]<a){
                N=(N+ (x.length-1))/2;
            }else if(x[N]>a){
                N=N/2;
            }else if (x[N]==a){
                k=false;
                return N;
            }
        }
                return 0;
    }


    public static void  ArraysSearch(int[] x, int a){
        Arraysearch s=new Arraysearch(a,x);
        int N=(x.length)/2;
        if(x[N]<a){
             s.search01(N);
        }else if(x[N]>a){
            s.search02(N);
        }else if (x[N]==a){
            System.out.println(a);
        }
    }
}
class Arraysearch{
    int a;
    int[] x;
    public Arraysearch(int a, int[] x){
        this.a=a;
        this.x=x;
    }
    public  void search01(int N){
        N=(N+ (x.length-1))/2;
        if(x[N]<a){
             this.search01(N);
        }else if(x[N]>a){
            this.search02(N);
        }else if (x[N]==a){
            System.out.println(N);
        }
    }
    public void search02(int N){
        N=N/2;
        if(x[N]<a){
            this.search01(N);
        }else if(x[N]>a){
            this.search02(N);
        }else if (x[N]==a){
            System.out.println(N);
        }
    }
}