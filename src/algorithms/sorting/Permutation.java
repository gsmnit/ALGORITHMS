package src.algorithms.sorting;

public class Permutation {
public static boolean IsP(int[] A,int[] B){
        int N=A.length;
        ShellSort.Sort(A);
        ShellSort.Sort(B);
        for(int i=0; i<N; i++){
            if(A[i]!= B[i]) return false;
        }
        return true;  
    }
public static void main(String[] args) {
    int[] A={1,3,2};
    int[] B={1,0,3};
    if(IsP(A,B)) 
        StdOut.print(" Array A and B are permutation of each other");
    else 
        StdOut.print(" Array A and B are not permutation of each other");
    
}
    
}
