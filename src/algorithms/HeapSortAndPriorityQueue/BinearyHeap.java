package src.algorithms.HeapSortAndPriorityQueue;
public class BinearyHeap{
    int[] A;
    int size;
    public BinearyHeap(int capacity){
        A=new int[capacity];
    }
    public boolean isEmpty() {
        return size==0;
    }
        
    public void insert(int item){
        A[++size]=item;
        swim(size);
    }
    private void swim(int k) {
        while(k>1 && A[k]>A[k/2] ){
           swap(k, k/2);
           k=k/2;
        }
        
    }
    private void sink(int k){
        while(2*k<=size ){
            int j=2*k;
            if(size!=2*k && A[j]<A[j+1]) j++;
            if(A[j]<A[k]) break;
            swap(k,j);
            k=j;
        }
    }
    
    private void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public int delMax(){
        swap(1,size);
        int result=A[size--];
        sink(1);
        A[size+1]=0;
        return result;

    }

}