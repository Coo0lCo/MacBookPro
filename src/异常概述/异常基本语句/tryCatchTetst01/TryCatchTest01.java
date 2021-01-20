package 异常概述.异常基本语句.tryCatchTetst01;

import java.util.HashMap;


/*
什么是异常：
        1.为程序不正常的情况 做出一定的回应
                类似：   x/0;   这在数学上面是不存在。
                java会有一个异常处理机制：它会显示 / by zero
        2.作用： 增强程序的健壮性
        3.是以什么样的形式存在：
                java.lang包下的   ArithmeticException类下
                    他继承了父类RuntimeException
        4。火灾  地震   这种类似  抽象出来的  类！！！！
                对象是具体的发生事件 ！！！
        5.java中有很多类似的    抽象出来的异常类    ：
                            例如： 1.算数异常ArithmeticException
                                  2.非常多就不列举了~~~
        6.
 */
public class TryCatchTest01 {
    public static void main(String[] args) {
        //尝试new出来
        //它会自动调用 Object  的实例方法
        /*
        输出：java.lang.NumberFormatException: 分母不能为零
        java.lang.NumberFormatException: 空指针异常*/
        NumberFormatException numberForma1=new NumberFormatException("分母不能为零");
        NumberFormatException numberForma2=new NumberFormatException("空指针异常");
        System.out.println(numberForma1);
        System.out.println(numberForma2);
        System.out.println(fun(10,1));
    }
    public static int fun(int a,int b) {
        //一旦java捕捉到了异常  就会new NumberFormaException对象 并抛出异常 他并不会继续执行程序
        return a/b;
    }
}
