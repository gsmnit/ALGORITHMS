package src.algorithms.HeapSortAndPriorityQueue;
public class HeapSort {
    public static void sort(int[] A) {
        arrToBH(A);
        int N = A.length - 2;
        for (int i = A.length - 1; i > 0; i--) {
            swap(A, 0, i);
            sink(A, 0, N--);

        }

    }

    private static void sink(int[] A, int k, int N) {
        while (2 * k + 1 <= N) {
            int j = 2 * k + 1;
            if (2 * k + 1 != N && A[2 * k + 1] < A[2 * k + 2])
                j++;
            if (A[j] > A[k])
                swap(A, j, k);
            else
                break;
            k = j;
        }
    }

    private static void arrToBH(int[] A) {
        int N = A.length - 1;
        for (int i = (A.length / 2) - 1; i >= 0; i--)
            sink(A, i, N);
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = { 3, 5, 1, 4, 2, 0, 9 };
        sort(A);

    }

}