package src.algorithms.HeapSortAndPriorityQueue;

import src.algorithms.sorting.StdIn;
import src.algorithms.sorting.StdOut;

public class OrderedMaxPQ {
    public int [] PQ;
    int count; // for counting the member in PQ
    public OrderedMaxPQ(int capacity){
        PQ=new int[capacity];
    }
    public void insert(int item){
        PQ[count++]=item;
        for(int i=count-1; i>0; i--){
            if( PQ[i]<PQ[i-1]) swap(i,i-1);
            else break;
        }

    }

    private void swap(int i, int j) {
        int temp=PQ[i];
        PQ[i]=PQ[j];
        PQ[j]=temp;
    }
    public boolean isEmpty() {
        return count==0;
        
    }
    public int delMax(){
        return PQ[--count];
    }
    public int size() {
        return count;
        
    }
    public static void main(String[] args) {
        var pq=new OrderedMaxPQ(10);
        while(!StdIn.isEmpty()){
            int n=StdIn.readInt();
            if(n==0) StdOut.print("\t"+pq.delMax());
            else pq.insert(n);

        }
        
    }
    
}
