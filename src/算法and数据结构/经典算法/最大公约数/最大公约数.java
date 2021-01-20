package 算法and数据结构.经典算法.最大公约数;

public class 最大公约数 {
    public static void main(String[] args) {
        System.out.println(gcd(12,24));
    }
    public static int gcd(int p,int q){
        if(q==0) return p;
        int r=p%q;
        return gcd(q,r);
    }
    /*算法原理源于欧几里得算法(辗转相除法)：
假如需要求 1997 (p)和 615(q) 两个正整数的最大公约数,用欧几里得算法，是这样进行的：
1997 / 615 = 3 (余 152)
615 / 152 = 4(余7)
152 / 7 = 21(余5)
7 / 5 = 1 (余2)
5 / 2 = 2 (余1)
2 / 1 = 2 (余0)
至此，最大公约数为1
    （很轻易我们可以想到用递归解决，结束条件为  r=0 ）
     这里的p， q无需判断谁大谁小，求余就可以帮我们判断了
     如果p=13，q=17
     p%q=13，接下来p，q的值会对调继续递归。
     */
}
