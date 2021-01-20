package subject01__;

public class StringFun {
    /**
        strcpy的功能：　　1）字符串str2会覆盖str1中的全部字符，
     　　                2）字符串str2的长度不能超过str1,
     */
    public static String strcpy(String str1,String str2){
        StringBuilder strA=new StringBuilder(str1);
        for(int i=0;i<str2.length();i++){
            strA.setCharAt(i,str2.charAt(i));
        }
        return str1;
    }

    /**
     strncpy的功能：1）不会清除str1中全部字符串，只会改变前n个字符串，
     　　          2）n不能大于字符串str1、str2的长度
     */
    public static String strncpy(String str1,String str2,int n){
        StringBuilder strA=new StringBuilder(str1);
        for(int i=0;i<n;i++){
            strA.setCharAt(i,str2.charAt(i));
        }
        return str1;
    }

    /**
        stract的功能：将字符串str2添加到字符串str1的尾部，也就是拼接两个字符串
     */
    public static String stract(String str1,String str2){
        str1=str1+str2;
            return str1;
    }

    /**
        strncat的功能：将字符串str2的前n个字符添加到字符串str1的尾部
     */
    public static String strncat(String str1,String str2,int n){
        for(int i=0;i<n;i++){
            str1=str1+str2.charAt(i);
        }
        return str1;
    }

    /**
        strlen的功能：计算字符串str1的长度
     */
    public static int strlen(String str1){
        return str1.length();
    }

class strchr{
        int i,n,k;
        int i1,n1,k1;
        int i2,n2,k2;
        public  int strchar01(String str,char c){
            for (i=0;i<str.length();i++){
                if(str.charAt(i)==c)break;
            }
            if (i==str.length()-1) {
                return this.n;          //  返回NULL
            }else {
                this.k=i;
            }
            return this.k;              //返回具体的位置
        }
        /**
         *
         */
        public  int strchar02(String str1, char c){
            for(i1=str1.length()-1;i1>-1;i1++){
                if (str1.charAt(i1)==c)break;;
            }
            if (i1==str1.length()-1) {
                return this.n1;         //返回NULL
            }else {
              this.k1=i1;
            }
           return this.k1;              //返回具体的位置
        }
        /**
         *
         */
        public  int strchar01(String str1,String str2){
            int i,j=0,Max,Min;
            int[] x=new int[str2.length()];
            for(i2=0;i2<str2.length();i2++){
                if (str1.length()-1==i2){
                    break;
                }
                x[i2]=this.strchar01(str1,str2.charAt(i2));
            }

            if(Arrayfun.ArraySum(x)==Arrayfun.ArraySum0(x)){
                this.k2=x[0];
            }else{
                return n2;
            }
            return this.k2;
        }
    }

    /**
     * strpbrk的功能为：
     */
    class strpbrk{
        int i,j,k;
        public int strpbrkGo(String str1,String str2){
            jb:
            for(i=0;i<str1.length();i++){
                for(j=0;j<str2.length();j++){
                        if(str1.charAt(i)==str2.charAt(j)){
                            this.k=j+1;
                            break jb;
                        }
                }
            }
            return this.k;
        }
}
    /**
     *
     */

    public static int[] TFint(String str1){
        int[] x=new int[str1.length()];
        for (int i=0;i<str1.length();i++){
            x[i]=str1.charAt(i)-'0';
        }
        return x;
    }

    public static double[] TFdouble(String str1){
        double[] x=new double[str1.length()];
        for (int i=0;i<str1.length();i++){
            x[i]=str1.charAt(i)-'0';
        }
        return x;
    }
    public static float[] TFlong(String str1){
       float[] x=new float[str1.length()];
        for (int i=0;i<str1.length();i++){
            x[i]=(float) (str1.charAt(i)-'0');
        }
        return x;
    }
}
class Arrayfun{
    public static double ArraySum(int x[]){
        double sum=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[0];
        }
        return sum;
    }
    public static double ArraySum0(int x[]){
        double a=x[0]+x[x.length-1];
        double sum=(a*x.length)/2;
        return  sum;
    }
}


