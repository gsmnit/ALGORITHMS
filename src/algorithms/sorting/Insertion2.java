package src.algorithms.sorting;

public class Insertion2 {
    public static void Sort(int[] A) {
        for(int i=1; i<A.length; i++){
            int j=i;
            while(j>0 && A[j] < A[--j]) swap(A,j,j+1);
            
        }
        
    }
    
    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    public static void main(String[] args) {
        int[] A={3,5,1,4,2};
        Sort(A);
        StdOut.print(A[2]);
      }
}
