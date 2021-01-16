package src.algorithms.sorting;

public class HSorting{
    public static void HSort(Comparable [] A,int h) {
        for(int i=h; i<A.length; i++ ){
            for(int j=i; j>=h&&less(A[j],A[j-h]); j-=h){
                swap(A,j,j-h);
            }
        }
        
    }
    
    public static void swap(Comparable[] A, int a, int b) {
        Comparable temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    public static boolean less(Comparable a,Comparable b) {
        return a.compareTo(b)<0;
        
    }

    public static void main(String[] args) {
        Integer[] A={1,5,9,2,4,2,5,6,7,8,9,11,10};
        HSort(A,3);
        for(int i=0; i<A.length; i+=3) StdOut.println(A[i]);
        
    }

}