package 算法课后习题;

public class do1_1_9 {
    public static void main(String[] args) {
        System.out.println(doIteger_toBinaryString(55333));
        System.out.println(Integer.toBinaryString(55333));
    }
    public static String doIteger_toBinaryString(int N){
        String s="";
        for (int i = N; i >0; i/=2) {
           s= (i%2) + s ;
        }
        return  s;
    }
}
