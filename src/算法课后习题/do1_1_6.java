package 算法课后习题;

public class do1_1_6 {
    public static void main(String[] args) {
        int f=0,g=1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f=f+g;
            g=f-g;
        }
    }
}
