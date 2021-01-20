package 多文件模块的学生信息管理系统.学生库;
/*
    学生类
 */
public class studen {
    /*
    学生信息包括：
     1.期末考试成绩（语文 数学 外语 本专业）
     2.学号
     3.名字
     4.性别（男/女/人妖）
     5.专业
     */
    public int xuehao;
    public String Name;
    public String sex;
    public String waiyu;
    public String zhuanye;
    public double yuwenchenji;
    public double shuxuechenji;
    public double waiyuchengji;
    public double zhuanyechengji;
    public studen(int xuehao,String Name,String sex,String waiyu,String zhuanye,double yuwenchenji, double shuxuechenji, double waiyuchengji, double zhuanyechengji){
            this.zhuanyechengji=zhuanyechengji;
            this.zhuanye=zhuanye;
            this.waiyuchengji=waiyuchengji;
            this.waiyu=waiyu;
            this.yuwenchenji=yuwenchenji;
            this.Name=Name;
            this.sex=sex;
            this.shuxuechenji=shuxuechenji;
            this.xuehao=xuehao;
    }
    public studen(){
    }
    @Override
    public String toString() {
        return "学号：" + this.xuehao +
                " 姓名:" + this.Name +
                " 性别："+this.sex+
                " 语文：" + this.yuwenchenji +"分"+
                " 数学：" + ":" + this.shuxuechenji+"分"+
                " " + this.waiyu + ":" + this.waiyuchengji+"分"+
                " " + this.zhuanye + ":" + this.zhuanyechengji+"分";
    }
}
