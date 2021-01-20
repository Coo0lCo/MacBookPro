package 算法and数据结构.数据结构.Stack.MyStack.定容栈的实现;
//以下程序我们可以发现  最先添加的元素  被放置在了末尾的位置  这也符合栈的存储特点---后进先出！

//这种只能是Sring 类型  显然适应能力极低
public class FixedCapactiyStackTest {
    private String[] s;
    private int N;
    private int n;
    //初始化栈   规定栈的大小
    public FixedCapactiyStackTest(int cap){
        this.s=new String[cap];
    }
    //接下来是方法   栈元素的添加  实例变量N未赋值默认为0
    public void push(String item){
        //每添加一次  位置就移动一次  下一次添加元素时就是下一个位置
        s[N++]=item;
    }
    public String pop(){
        return s[--N];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public String putoutString(){
        return s[n++];
    }
}
class FCstest{
    public static void main(String[] args) {
        FixedCapactiyStackTest s=new FixedCapactiyStackTest(4);
        s.push("hellow world");
        s.push("hellow myGirlfriend");
        s.push("babay i love you");
        s.push("D S B");

        boolean b=s.isEmpty();
        for (int i = 0; i < 4; i++) {
            System.out.println(s.putoutString());
        }
    }
}
//运用泛型 来解决
class FixedCapactiyStack<Item>{
    private Item[] s;
    private int N;
    private int n;
    public FixedCapactiyStack(int cap){
        //类型强转   这是因为  我们无法直接   s=new Item[cap];这是java不允许的   必须类型转换
        this.s=(Item[]) new Object[cap];
    }
    public void push(Item item){
        //每添加一次  位置就移动一次  下一次添加元素时就是下一个位置
        s[N++]=item;
    }
    public Item pop(){
        return s[--N];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public Item putoutItem(){
        return s[n++];
    }
}
class FixedCapactiyStacktest{
    public static void main(String[] args) {
        FixedCapactiyStack<String> s=new FixedCapactiyStack<String>(3);
        s.push("hellow myGirlfriend");
        s.push("babay i love you");
        s.push("D S B");
        boolean b=s.isEmpty();
        for (int i = 0; i < 3; i++) {
            System.out.println(s.putoutItem());
        }
        FixedCapactiyStack<Double> s1=new FixedCapactiyStack<Double>(2);
        s1.push(3.1414);
        s1.push(6.666);
        for (int i = 0; i < 2; i++) {
            System.out.println(s1.putoutItem());
        }
    }
}