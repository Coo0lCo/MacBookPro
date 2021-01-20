package 算法and数据结构.数据结构.Queue.javaQueueTest;


import java.util.*;

public class QueueTest{
    public static void main(String[] args) {
        car c1=new car("红色",100,20);
        car c2=new car("黑色",99,19);
        car c3=new car("白色",98,18);
        car c4=new car("棕色",97,17);
        car c5=new car("紫色",96,16);
        Queue<car> q1= new Queue<car>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<car> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(car car) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends car> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(car car) {
                return false;
            }

            @Override
            public car remove() {
                return null;
            }

            @Override
            public car poll() {
                return null;
            }

            @Override
            public car element() {
                return null;
            }

            @Override
            public car peek() {
                return null;
            }
        } ;
        Queue<car> q=new LinkedList<car>();


    }
}
class car{
    String color;
    int model;
    int size;
    public car(String color,int model,int size){
        this.color=color;
        this.model=model;
        this.size=size;
    }
}