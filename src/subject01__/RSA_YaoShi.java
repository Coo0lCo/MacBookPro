package subject01__;
import java.util.Objects;
import java.util.Scanner;
public class RSA_YaoShi extends Find_e{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入两个质数（大于等于3小于100）:");
        int[] pq=new int[2];
        for(int i=0;i<2;i++){
            int nb=sc.nextInt();
            pq[i]=nb;
        }
        /*
        新建一个类去实现接口再 定义父类型引用指向子类对象 中的 构造方法（重写方法）
        chenfa cf=new Mychenfa();
         System.out.println(cf.chenfa(3,7));
         匿名内部类实现
        System.out.println(new chenfa(){
            public int chenfa(int p,int q){
                return p*q;
            }
            public int _1chenfa(int p,int q){
                return (p-1)*(q-1);
            }
            public String toString(){
                return this.chenfa(3,7)+"";
            }
        });
         */
        chenfa cf1=new Mychenfa();
        int n=cf1.chenfa(pq[0], pq[1]);
        System.out.print("n---->"+n);
        System.out.print("\n");
        int fai=cf1._1chenfa(pq[0],pq[1]);
        System.out.print("fai----->"+fai);
        System.out.print("\n");
        Find_e s=new Find_e();
        int[] eE=new int[1000];
        //找到了  n fai e
        eE=s.Myfind_e(fai);
        System.out.print("e------->");
        for(int i=0;i<eE.length;i++){
            if(eE[i]==0)break;
            System.out.print(eE[i]+" ");
        }
        System.out.print("\n");
        System.out.print("d------->");
        int[] dnumber=new int[1000];
        find_d fd=new find_d();
        dnumber=fd.Myfind_d(eE,fai);
        for(int i=0;i<eE.length;i++){
            if(dnumber[i]==0)break;
            System.out.print(dnumber[i]+" ");
        }
    }
}

interface chenfa{
    public int chenfa(int p,int q);
    public int _1chenfa(int p,int q);
    //写不写都一样（ public String toString(); ）
}
class Mychenfa implements chenfa{
   //方法重写
    public int chenfa(int p,int q){
        return p*q;
    }
    public int _1chenfa(int p,int q){
        return (p-1)*(q-1);
    }
}
class Find_e{
    public int[] Myfind_e(int number){
        int[] enumber=new int[1000];
        boolean panduan=true;
        int e=2,h=-1;
        int fai=number;
        do {
            e++;
            for(int i=2;i<e;i++){
                if(e%i==0 && fai%i==0){
                    panduan=false;
                }
            }
            if (panduan)enumber[++h]=e;
            panduan=true;
        }while (e!=fai);
        return enumber;
    }
}
class find_d{
    public int[] Myfind_d(int enumber[],int fai){
        int[] dnumber=new int[1000];
        int i,j=-1,d=0;
        for(i=0;i<enumber.length;i++){
            if (enumber[i]==0)break;
            int e=enumber[i];
            do{
                d++;
                int a_b=(e*d)-1;
                if(a_b%fai==0){
                    dnumber[++j]=d;
                }
            }while (d<fai);
            d=0;
        }
     return dnumber;
    }
}