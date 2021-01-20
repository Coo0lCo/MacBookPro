package 多文件模块的学生信息管理系统.功能实现模块.新建学生信息;
import 多文件模块的学生信息管理系统.学生库.studen;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*
    这里我选取 哈希表来存储学生信息  信息查询效率高 链表存储学号   key对应学号  value对应学生信息
 */
public class xingxishuchu {

    //建立一个哈希表 存储 学号及其对应的学生  便于 用户指定学号的学生查找并修改信息   （查询效率极高）
    public HashMap<Integer,studen> allstuden;

    // 双向链表存储存储学号   用于修改（增删改效率较高）
    public List allxuehao;

    //  无参构造方法用于用户 新建学生信息  （可循环读取用户输入学生信息  以eof为结束标识符）
    public xingxishuchu(){
        HashMap<Integer,studen> hashMap=new HashMap<>();
        List<Integer> xuehao=new LinkedList<>();
        /*
           一般我们是不知道用户要输入多少数据的 用户也不想去计算要输入多少数据
           所以我们需要一个循环读入 的终止条件   这里可以用hasNext（String）方法 来判断 （eof为结束标识符）
         */
        Scanner sc=new Scanner(System.in);
        while (!sc.hasNext("eof")){
            studen s=new studen(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            xuehao.add(s.xuehao);
            hashMap.put(s.xuehao,s);
        }
        this.allxuehao=xuehao;
        this.allstuden=hashMap;
    }

    // 输出学生信息
    public void putstuden(){
        //  增强for循环迭代 输出studen信息
        for(Object i : this.allxuehao){
            System.out.println(this.allstuden.get(i));
        }
    }

    // 计算指定学科 平均成绩 （那当然需要用户输入科目  程序输出平均分 最好以字符串形式输出 用户观感更好）
    public String jisuanpingjunfen(String kemu){
        int sum=0;
        switch (kemu){
            case "语文":
                    for(Object i : this.allxuehao){
                        sum+=this.allstuden.get(i).yuwenchenji;
                    }
                    return "语文平均分："+((double)sum/this.allxuehao.size());
            case "数学":
                for(Object i : this.allxuehao){
                    sum+=this.allstuden.get(i).shuxuechenji;
                }
                return "数学平均分："+((double)sum/this.allxuehao.size());
            case "专业":
                for(Object i : this.allxuehao){
                    sum+=this.allstuden.get(i).zhuanyechengji;
                }
                return "专业平均分："+((double)sum/this.allxuehao.size());
            case "外语":
                for(Object i : this.allxuehao){
                    sum+=this.allstuden.get(i).waiyuchengji;
                }
                return "外语平均分："+((double)sum/this.allxuehao.size());
        }
        return "";
    }
    //按照选择排序  只要大于平均就顺序存入
    public List<studen> paixu(String kemu){
        List<studen> list=new LinkedList<>();
        // String---->String（只含平均分的字符串）---->int（转换成int类型）
        String s=this.jisuanpingjunfen(kemu);
        String ss=s.substring(6,s.length());
        int pinjunfen=Integer.parseInt(ss);


        return list;
    }

    // 修改指定学生指定科目成绩（通过编号查询学生信息）
    public void deletestuden(int xuehao,String kemu,int deletechengji){
        this.allstuden.get(xuehao);
        switch (kemu){
            case "语文":
                this.allstuden.get(xuehao).yuwenchenji=deletechengji;
                break;
            case "数学":
                this.allstuden.get(xuehao).shuxuechenji=deletechengji;
                break;
            case "专业":
                this.allstuden.get(xuehao).zhuanyechengji=deletechengji;
                break;
            case "外语":
                this.allstuden.get(xuehao).waiyuchengji=deletechengji;
                break;
        }
    }
}
class test{
    public static void main(String[] args) {
        String s="专业平均分：99";
        String ss=s.substring(6,s.length());
        int pinjunfen=Integer.parseInt(ss);
        System.out.println(pinjunfen);
    }
}



/*
2040669203 李永杰 男 日语 软件工程 99.0 92.0 88.5 56.7
2040669253 陈冠希 男 德语 资产评估 59.0 92.0 78.0 59.8
2040669223 赵丽颖 女 法语 国际贸易 89.0 32.0 48.0 75.6
 */
