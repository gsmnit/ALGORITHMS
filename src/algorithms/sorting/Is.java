package src.algorithms.sorting;

public class Is {

    public static boolean less(Comparable V, Comparable W) {
        return V.compareTo(W)<0;
    }
    public static boolean Sorted(Comparable[] A){
        for(int i=1; i<A.length; i++){
            if(less(A[i],A[i-1])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] A={1,3,3,4,5};
        StdOut.println(Sorted(A));
    }
}
