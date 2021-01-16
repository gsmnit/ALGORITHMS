package src.algorithms.sorting;

public class Selection {
    public static void Sort(int [] A) {
        for(int i=0; i<A.length; i++){
            int min=i;
            for(int j=i+1; j<A.length; j++){
                if(A[min]>A[j])
                    min=j;
                }
            if(i!=min)
                swap(A,i,min);
            }
        }
    
    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    public static void main(String[] args) {
        int[] A = { 3, 5, 2, 4, 1 };
        Sort(A);
        StdOut.print(A[1]);
    }

    
}
