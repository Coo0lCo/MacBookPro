package subject01__;

public class JiuJiuChenfabiao {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            int k=0;
            for(int s=1;s<=i;s++) {
                if(s==i) {
                    k=i*s;
                    System.out.println(i+"x"+s+"="+k);
                }else {
                    k=i*s;
                    System.out.print(i+"x"+s+"="+k);
                    System.out.print(' ');
                }
            }
        }
    }
}
