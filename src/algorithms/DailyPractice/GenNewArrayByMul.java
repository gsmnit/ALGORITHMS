package src.algorithms.DailyPractice;
import src.algorithms.sorting.StdOut;

public class GenNewArrayByMul {
    public static int[] newArray(int[] A) {

        int productOfAllNonZeroInt = 1;
        int countZero = 0;
        boolean flag = false;
        int positionOfFirstZero = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] != 0)
                productOfAllNonZeroInt *= A[i];

            else {
                if (countZero == 0) {
                    positionOfFirstZero = i;
                    countZero++;
                    flag = true;
                } else {
                    return allZero(A);
                }
            }

        }

        for (int i = 0; i < A.length; i++) {
            if (flag) {
                if (i != positionOfFirstZero)
                    A[i] = 0;
                else
                    A[i] = productOfAllNonZeroInt;
            } else {
                A[i] = productOfAllNonZeroInt / A[i];
            }

        }
        return A;
    }
    public static int[] allZero(int[] A) {
        int j = 0;
        while (j < A.length)
            A[j++] = 0;
        return A;
        
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 0, 10, 0, 4 };
        // A[0]=A[1]=A[2]=A[3]=0;
        A = newArray(A);
        for (int i : A)
            StdOut.print(i + "\t");
    }
}

