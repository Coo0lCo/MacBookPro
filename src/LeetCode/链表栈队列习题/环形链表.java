package LeetCode.链表栈队列习题;
import java.util.LinkedList;
public class 环形链表 {
    public static void main(String[] args) {
        nnListNode x=new nnListNode(1);
        nnListNode xx=new nnListNode(1);
        LinkedList<nnListNode> n=new LinkedList<>();
        n.add(x);
        n.add(xx);
        System.out.println(n.get(0));
    }
}
class Solution017{
    // 最近抽风了见什么都递归 。。。 显然效率很低
    LinkedList<nnListNode> list=new LinkedList<nnListNode>();
    public boolean hasCycle(nnListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        if(this.list.contains(head.next)){
            return true;
        }
        this.list.add(head);
        return hasCycle(head.next);
    }
    // 快慢指针 是个解决查询环链表的好法子
    /*
        快慢指针：
                乌龟跑的慢乌龟是后进入环的
                兔子跑的快兔子是后进入环的
                当两者都进入环
                兔子一定会追到乌龟
                当乌龟与兔子相遇则
                存在环
                若兔子走到了null
                则无环
     */
    public boolean hasCycle01(nnListNode head){
        nnListNode l1=head;
        if(l1==null){
            return false;
        }
        nnListNode l2= head.next;
        if (l2==null ||l2.next==null || l2.next.next==null){
            return false;
        }
        while(true){
            if (l2.next==null || l2.next.next==null){
                return false;
            }
            if(l1.equals(l2)){
                return true;
            }
            l1=l1.next;
            l2=l2.next.next;
        }
    }
}
class nnListNode {
      int val;
      nnListNode next;
      nnListNode(int x) {
          val = x;
          next = null;
      }
}