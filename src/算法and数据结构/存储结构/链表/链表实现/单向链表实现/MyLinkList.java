package 算法and数据结构.存储结构.链表.链表实现.单向链表实现;


public class MyLinkList{
    //头节点
    private LinkNode first=new LinkNode(null,null);
    private int sive;
    //添加元素
    public MyLinkList(){}
    // 添加元素
    public void add(Object obj){
        if(first.next==null){
            first.next=new LinkNode(obj,null);
        }else{
            LinkNode lastNode=SearchlastNode(first.next);
            lastNode.next=new LinkNode(obj,null);
        }
        sive++;
    }
    private LinkNode SearchlastNode(LinkNode first){
        LinkNode node=first;
        while(true){
            if(node.next==null){
                return node;
            }
            node=node.next;
        }
    }
    // 在头节点增加元素
    public void addHeadNode(Object obj){
        if (first.next==null){
            add(obj);
        }else {
            first.next=new LinkNode(obj,first.next.next);
        }
        sive++;
    }
    // 删除头节点
    public boolean deleteHeadNode(){
        if(first.next==null){
            return false;
        }else {
            first.next=first.next.next;
            sive--;
            return true;
        }
    }

    // 查询链表中元素的个数
    public int size(){
        return this.sive;
    }
    // 删除指定元素
    public boolean delete(Object obj){
        if(first.next==null){
            return false;
        }
        LinkNode node=first.next;
        while(node!=null){
            if(obj.equals(node.date)){
                return true;
            }
            node=node.next;
        }
        return false;
    }
    // 在指定元素后增加新元素
    public boolean appointAdd(Object obj,Object newobj){
            if(first.next==null){
                return false;
            }

            LinkNode node=first.next;
            while(node!=null){
                if(obj.equals(node.date)){
                    if(node.next==null){
                        node.next=new LinkNode(newobj,null);
                        return true;
                    }
                    node.next=new LinkNode(newobj,node.next.next);
                    return true;
                }
                node=node.next;
            }
            return false;
    }
}

class LinkNode {
    public Object date;
    public LinkNode next;
    public LinkNode(Object obj, LinkNode next){
        // 是梦开始的起点也是 所有过程的必经之路！！
        this.next=next;
        this.date=obj;
    }
    @Override
    public String toString() {
        return (String) date;
    }
}
