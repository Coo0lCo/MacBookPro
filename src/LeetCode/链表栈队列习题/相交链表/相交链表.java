package LeetCode.链表栈队列习题.相交链表;

import java.util.Stack;

public class 相交链表 {
    public static void main(String[] args) {

    }
}
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=length(headA);
        int b=length(headB);
        if(a>b){
            return getIntersectionNodeGo(headA,headB,a,b);
        }else if(a<b){
            return getIntersectionNodeGo(headB,headA,b,a);
        }else{
            ListNode i=headA;
            ListNode j=headB;
            while(true){
                if(i.equals(j)){
                    return i;
                }
                if(i==null || j==null){
                    return null;
                }
                i=i.next;
                j=j.next;
            }
        }
    }
    public int length(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public ListNode getIntersectionNodeGo(ListNode headA, ListNode headB,int a,int b){
        ListNode i=headA;
        ListNode j=headB;
        while(true){
            i=i.next;
            a--;
            if(a==b)break;
        }
        while(true){
            if(i.equals(j)){
                return i;
            }
            if(i==null || j==null){
                return null;
            }
            i=i.next;
            j=j.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }