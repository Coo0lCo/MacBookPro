package 算法and数据结构.经典算法.矩阵相乘;

public class 矩阵相乘 {
    public static void main(String[] args) {

    }
    public static int[][] do矩阵相乘(int a[][],int b[][]){
        int N=a.length;
        int c[][]=new int[a.length][a.length];
        /*
            首先明确i,j,k分别表示什么？
            i:
            j:
            k:
         */
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    c[i][j]+=a[i][k]*b[k][i];
                }
            }
        }
        return c;
    }

    /*
    这里需要一些矩阵相乘的知识：
                条件：A矩阵的列要等于B矩阵的行。
                法则：1.相乘的道德矩阵C满足（矩阵C的行数等于矩阵A的行数，C的列数等于B的列数）。
                     2.乘积C的第m行第n列的元素等于矩阵A的第m行的元素与矩阵B的第n列对应元素乘积之和。
    在这里提及一下：
        在java中二维数组其实就是特殊的一维数组，请看：{{}，
                                                {}，
                                                {}}；
        在一维数组中每个元素是一个字面值（数值），而二维数组呢每个元素是一个一维数组。（所以java中的二维数组可以是很不整齐的每个一维数组的长度可以不一样）。
     */
}
