package src.algorithms.HeapSortAndPriorityQueue;

import src.algorithms.sorting.StdIn;
import src.algorithms.sorting.StdOut;

public class UnOrderedMaxPQ {
    private int[] PQ;
    private int N;
    public UnOrderedMaxPQ(int CapacityOfPQ){
        PQ= new int[CapacityOfPQ];
    }
    public  boolean isEmpty() {
        return N==0;
    }
    public void insert(int item) {
        PQ[N++]=item;
        
    }
    public int delMax(){
        int max=0;
        for(int i=1; i<N; i++){
            if(PQ[i]>PQ[max]) max=i;
          }
        swap(max,N-1);
        return PQ[--N];
    }
    private void swap(int a,int b){
        int temp=PQ[a];
        PQ[a]=PQ[b];
        PQ[b]=temp;
    }
    public static void main(String[] args) {
        var pq=new UnOrderedMaxPQ(10);
        while(!StdIn.isEmpty()){
            int n=StdIn.readInt();
            if(n==0) {
                StdOut.println(pq.delMax());
                break;
            }
            else pq.insert(n);

        }

    }
       
}
