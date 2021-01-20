package 集合.CollectionIteratorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteravleTest {
    public static void main(String[] args) {
        //超父类类型接口 的引用指向 子类
        Collection c=new ArrayList();

        c.add("aaa");
        c.add("666");
        c.add("2dfc");
        c.add("hhh");
        Iterator iterator=c.iterator();

        //创建迭代器对象并通过  Iterator中的方法 迭代输出对象
        //最初迭代器对象并未指向  集合中的元素 next之后才开始指向第一个
        // hasNext（）返回true表示还有元素可以迭代   如果是false则无元素可以迭代
        while (iterator.hasNext()){
            //next（） 可以让迭代器前进一位并将指向的元素 返回
            System.out.println(iterator.next());
        }

        //无序 不可重复
        Collection c1=new HashSet();
        c1.add("aaa");
        c1.add("666");
        c1.add("2dfc");
        c1.add("hhh");

        Iterator iterator1=c1.iterator();

        //contains 方法是用于判断集合中是否包含某个对象o

        Collection c2=new HashSet();
        c2.add("aaa");
        c2.add("666");
        c2.add("2dfc");
        c2.add("hhh");
        System.out.println("元素的个数："+c2.size());
    }
}
class fangfatest{
    public static void main(String[] args) {
        Collection c2=new ArrayList();
        c2.add("aaa");
        c2.add("666");
        String s1=new String("999");
        c2.add(s1);
        c2.add("hhh");
        String s=new String("999");
        System.out.println("元素的个数："+c2.size());
        //contains 方法是用于判断集合中是否包含某个对象o
        System.out.println(s.equals(s1));
        System.out.println("是否包含元素s："+c2.contains(s));
    }
}
// 重写equals可比较内容   没有重写比较的是内存地址