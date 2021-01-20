package LeetCode.链表栈队列习题;

import java.util.ArrayDeque;

public class 回文链表 {

}
class Solution {
    public boolean isPalindrome(nnnListNode head) {
        ArrayDeque<nnnListNode> deque=new ArrayDeque<>();
        while(head!=null){
            deque.addFirst(head);
            head=head.next;
        }
        boolean t=true;
        while(!deque.isEmpty()){
            if(deque.removeLast().equals(deque.getFirst ())){
                break;
            }
            t=t && ( deque.removeLast().val==deque.getFirst ().val);
        }
        return t;
    }
}
class nnnListNode{
      int val;
      nnnListNode next;
      nnnListNode(int x) { val = x; }
}