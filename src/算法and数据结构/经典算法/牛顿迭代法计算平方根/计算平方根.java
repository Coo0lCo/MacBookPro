package 算法and数据结构.经典算法.牛顿迭代法计算平方根;

public class 计算平方根 {
    public static void main(String[] args) {
        System.out.printf("%f",do平方根(5.0));
        System.out.println();
        System.out.printf("%f",do平方根1(5.0));
    }
    public static double do平方根(double c){
        if(c<0)return Double.NaN;       //返回一个常量
        double err=1e-15;
        double t=c;
        double k=0;
        while (k!=t){
           k=t;
            t=(t+c/t)/2.0;
        }
        return t;
    }
    public static double do平方根1(double c){
        if(c<0)return Double.NaN;       //返回一个常量
        double err=1e-15;
        double t=c;
        while (Math.abs(t-c/t)>err*t){
            t=(t+c/t)/2.0;
        }
        return t;
    }
}
/*
这里用到的是牛顿迭代法：
        数学推导不好呈现。。。
 */

/*
这里顺便提及一下java内裤中的与数学运行处理相关的类-------Math：
Math.pow(double a, double b);//计算a的b次方

Math.abs(int/float/double/long/ o);计算数值的绝对值

Math.acos(double a);计算参数的反余弦值，返回弧度

Math.asin(double a);计算参数的反正弦值，返回弧度

Math.atan(double a);计算参数的反正切值，返回弧度

Math.atan2(double a, double b);计算参数的反正切值

Math.addExact(int/long x, int/long y);计算其参数总和，如果结果溢出，则抛出异常

Math.sin(double a);//计算参数的正弦值，参数是弧度

Math.cos(double a);//计算参数的余弦值，参数是弧度

Math.tan(double a);//计算参数的正切值，参数是弧度

Math.toRadians(double angdeg);//角度转弧度

Math.toDegress(double argrad);//弧度转角度

Math.exp(double a);//返回欧拉数E的a次幂

Math.log(double a);//以e为底的对数a，返回幂次

Math.log10(double a);//以10为底的对数a，返回幂次

Math.log1p(double a);//以a+1为底的自然对数

自然对数：是以常数e为底数的对数

Math.sqrt(double a);//对a进行开平方

Math.cbrt(double a);//对a进行开三次方

Math.ceil(double a);//对a进行向上取整，即10.9=11，-10.9=10

Math.floor(double a);//对a进行向下取整，即10.9=10，-10.9=-11

Math.rint(double a);//对a进行四舍五入，偶数的.5会被舍弃

Math.atan2(double y, double x);//求向量(x,y)与x轴的夹角

Math.pow(double a, double b);//求a的b次方

Math.round(float/double a);//对a进行四舍五入

Math.random();//生成一个随机数（0~1）

Math.subtractExact(int/long x, int/long y);//求商

Math.multiplyExact(int/long x, int/long y);//求乘

Math.incrementExact(int/long a);//自增1

Math.decrementExact(int/long a);//自减1

Math.negateExact(int/long a);//求反

Math.toIntExact(long value);//转int

Math.floorDiv(int/long x, int/long y);//以x除以y，然后对结果进行求下限，即对商进行Math.floor

Math.floorMod(int x, int y);//如果x,y符号相同，则与%结果一致

Math.max(int/long/float/double a, int/long/float/double b);//求两者的最大值

Math.min(int/long/float/double a. int/long/float/double b);//求两者的最小值

Math.ulp(double d);//返回参数的ulp大小，所谓的ulp，则是表示一个数字和距其最近的数字之间的距离。在计算机中保存的数和在数学上认为的是不一样的，比方说2.0与3.0之间有多少个数，在数学中是无限的，但在计算机中是有限的。比如double最大只有64位，则其最近的数字则是到最小位+1

Math.signum(float/double a);//返回指定int值的符号函数，如果指定值为负，则返回-1，如果指定值是0，则返回0，如果指定值为正数，则返回1

Math.sinh(double x);//计算双曲正弦

Math.cosh(double x);//计算双曲余弦

Math.cosh(double x);//计算双曲正切

Math.hypot(double x, double y);//用来求两点间的距离

Math.expm1(double x);//返回(e^x) - 1

Math.nextAfter(double start, double direction);//返回与第二个参数方向相邻的第一个参数的浮点数

Math.nextUp(double d);//返回与正无穷大方向相邻的d的浮点值

Math.nextDown(double d);//返回与负无穷大方向相邻的d的浮点值

 */