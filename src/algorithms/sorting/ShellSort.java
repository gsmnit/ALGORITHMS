package src.algorithms.sorting;
 public class ShellSort{
     public static void Sort(Comparable[] A) {
         int N=A.length;

         int h = 1;
         while(h<N/3) h=3*h+1;

         while(h>=1){
             HSorting.HSort(A, h);
             h=h/3;
         }
         
     }
     public static void main(String[] args) {
         Integer[] A = { 1, 5, 14, 11, 12, 15, 13, 10, };
         Sort(A);
         for(int i:A) StdOut.println(i); 
     }

 }