package subject01__;

public class LaoTie666 {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("小笨蛋cbd请输入一个非负整数：");
        int naturalnumber=s.nextInt();

        int k=0;
        int a=naturalnumber;
        int b=naturalnumber;
        boolean g=true;
        int v=1;
        //声明一些后面需要的变量

        //用if将输入0时的输出0的要求解决
        if(naturalnumber==0){
            System.out.println("0");
        }else{
            for(int i=10;g;i*=10){   //用for实现累加
                k=i*naturalnumber;   //k和b的过程是为了计算下一个所需要加的值
                b=b+k;
                a=a+b;
                v++;                //v的存在是为了判断循环是否结束
                if(v==naturalnumber)
                    break;
            }
            System.out.println(a);
        }
    }
}
