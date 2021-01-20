package 算法and数据结构.数据结构.Map超父接口;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合  以 Key和Value键值对 来存储对象内存地址
            key和value都是 引用数据类型
            key起主导作用  value是附属品
        Map中的常用方法 ：
            void clear（）
            V put(K key,V value)向Map集合中添加键值对
            boolean	isEmpty()返回true如果此映射不包含键-值映射关系。
            V get(Object Key)通过key获得Value
            Set<Map.Entry<K,V>>	entrySet()
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"kkl");
        m.put(2,"dasc");
        m.put(3,"oacvv");

        System.out.println(m.get(1));
        System.out.println("键值对的数量："+m.size());

        Set<Integer> s=m.keySet();
        Iterator<Integer> it=s.iterator();
        for (Integer i : s){
            System.out.println(i+":"+m.get(i));
        }
//
        System.out.println("--------------------------------------------------------");
        Set<Map.Entry<Integer,String>> s1=m.entrySet();

        for (Map.Entry<Integer,String> i : s1){
            System.out.println(i);
        }

        /*
        哈希表是数组和链表的结合体！！


         */
    }
class studen{






}


























    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }
        return -1;
    }
}
