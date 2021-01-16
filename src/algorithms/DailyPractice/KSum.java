package src.algorithms.DailyPractice;

import src.algorithms.sorting.ShellSort;
import src.algorithms.sorting.StdOut;

public class KSum {
    public static boolean kSum(Integer[] A, int k) {
        ShellSort.Sort(A);
        int j = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            while (!(i >= j)) {
                int sum = A[i] + A[j];
                if (sum == k)
                    return true;
                if (sum > k)
                    j--;
                if (sum < k)
                    break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] A = { 3, 7, 2, 15,5,6 };
        if (kSum(A, 17))
            StdOut.println("true");
        else
            StdOut.println("false");
    }

}