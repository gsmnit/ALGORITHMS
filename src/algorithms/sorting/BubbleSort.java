package src.algorithms.sorting;

public class BubbleSort {
    public static void Sort(int[] A){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length-1; j++){
                if(A[j]>A[j+1]) swap(A,j,j+1);
            }
        }
    }
    public static void swap(int[] A,int a,int b){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public static void main(String[] args){
        int[] A={3,5,1,4,2};
        Sort(A);
        StdOut.println(A[2]+A[4]);

    }

    
}
