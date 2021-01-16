package src.algorithms.sorting;
public class Experiment {
     public static void main(String[] args) {
         int N = 10;
         Double[] a=new Double[N];
         for(int i=0; i<N; i++)
            a[i]=StdRandom.uniform();
        Insertion.sort(a);
        for(int i=0; i<N; i++)
            StdOut.println(a[i]);
     }
    }
