package LeetCode.链表栈队列习题;

public class 删除排序链表中的重复元素 {
    public static void main(String[] args) {


    }
}
class Solution016{
    nListNode i;
    public nListNode deleteDuplicates(nListNode head) {
        if(head==null)return null;
        nListNode i=new nListNode(head.val);
        this.i=i;
        return digui(head,i);
    }
    public nListNode digui(nListNode head,nListNode i){
        if(head.next==null){
            return this.i;
        }
        if(i.val==head.next.val){
            return digui(head.next,i);
        }else{
            i.next=new nListNode(head.next.val);
            return digui(head.next,i.next);
        }
    }

}
class nListNode{
      int val;
      nListNode next;
      nListNode(int x) {
        val = x;
    }
}