package 多文件模块的学生信息管理系统.功能显示模块.功能显示println;

public class gongnengxingxi {
    public gongnengxingxi(){
        System.out.println("Hllow(\"  _   _      _ _    __        __         _     _ \n" +
                " | | | | ___| | | __\\\\ \\\\      / /__  _ __| | __| |\n" +
                " | |_| |/ _ \\\\ | |/ _ \\\\ \\\\ /\\\\ / / _ \\\\| '__| |/ _` |\n" +
                " |  _  |  __/ | | (_) \\\\ V  V / (_) | |  | | (_| |\n" +
                " |_| |_|\\\\___|_|_|\\\\___/ \\\\_/\\\\_/ \\\\___/|_|  |_|\\\\__,_|" +"");
        System.out.println("Welcome to use this system:");
        System.out.println("本程序可支持以下功能：");
        System.out.println("1.按1可以新建学生信息(你需要顺序输入以下信息：学号 姓名 性别 语文成绩 数学成绩 所学外语 及外语成绩 所学专业 及专业成绩)");
        System.out.println("2.按2+学科即可计算该科目平均成绩");
        System.out.println("3.按3可以修改学生成绩");
        System.out.println("4.按4即可查询新建的学生信息");
        System.out.println("5.按5+科目 可以查询学生信息（并按照指定科目平均成绩排序输出学生信息）");
        System.out.println("6.按6+科目 可以查询该科目不及格人数（成绩低于60（不包含））");
    }
}
class test{
    public static void main(String[] args) {
        new gongnengxingxi();
    }
}