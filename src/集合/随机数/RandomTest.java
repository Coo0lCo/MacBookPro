package 集合.随机数;

import java.util.Arrays;
import java.util.Random;
//随机生成五个不重复的数并存入数组中(该随机数小于101)
/*
    运用到了关于数的方面的类：Random类
 */
public class RandomTest {
    public static void main(String[] args) {
        //逐个遍历查找方法   操作
        Random r=new Random();
        int[] number=new int[5];
        int i;
        for (i = 0; i < number.length; i++) {
            number[i]=11;
        }
        i=0;
        int k=r.nextInt(10);
        boolean t=true;

        while (t){
            k=r.nextInt(5);
            if(遍历查找(number,k)){
                number[i++]=k;
            }
            if (i==number.length)t=false;
        }
        for (i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        //以下二分法查询判断   操作
        // --------------------------------------------------------------
        int[] number01=new int[5];
        int i1;
        for (i1 = 0; i1 < number01.length; i1++) {
            number01[i1]=11;
        }
        System.out.println("----------");
        i1=0;
        int k1=r.nextInt(10);
        boolean t1=true;

        while (t1){
            k1=r.nextInt(11);
            if(!二分法查找(number01,k1)){
                number01[i1++]=k1;
            }
            if (i1==number01.length)t1=false;
        }
        System.out.println("--------------------------------");
        for (i1 = 0; i1 < number01.length; i1++) {
            System.out.println(number01[i1]);
        }
    }

    public static boolean 遍历查找(int[] number,int a){
        //这里就需要设计一个 查找算法
        for(int i=0;i< number.length;i++){
            if(number[i]==a)return false;
        }
        return true;
    }

    public static boolean 二分法查找(int[] number,int a){
        //二分法查找的前提是  有序的   java写好的排序方法是   Arrays类下的sort方法（静态方法）
        Arrays.sort(number);
        //接下来是二分法查找    java写好的二分法查找方法是   Arrays类下的binarySearch（静态方法）
        return Arrays.binarySearch(number,a)>=0;
    }
}
