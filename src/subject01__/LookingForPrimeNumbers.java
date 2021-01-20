package subject01__;

public class LookingForPrimeNumbers {
    public static void sum(int h,int j) {
        System.out.println(h + j);
        System.out.print("   ");
    }
    public static void main(String[] args) {
        LookingForPrimeNumbers.sum(99,98);
            int b;
            boolean nmd=true;
            for(int a=2;a<=1000;a++){
                   for( b=2;b<a;b++){
                       nmd=true;
                       int k=0;
                       k=a%b;
                       if(k==0){
                           nmd=false;
                           break;
                            }
                       }
                                if(nmd)
                                    System.out.println(b);
                   }


            }

    }



     /*       java.util.Scanner s = new java.util.Scanner(System.in);//接受键盘的输入
        System.out.println("欢迎使用本系统来筛选您所选范围的数据中的素数");
        System.out.print("请输出数据的下限：");
        int n1 = s.nextInt();
        System.out.print("请输出数据的上限：");
        int n2 = s.nextInt();

        for(int a=n1;a<=n2;a++){
            int b;
            int k=0;
            for(b = 2; b<a; b++) {
                if k = a % b)

            }

        }
 */