/*

Given an array of n positive integers. Write a program to find the sum of maximum sum
 subsequence of the given array such that the intgers in the subsequence are sorted in increasing order.
  For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100),
   if the input array is {3, 4, 5, 10}, then output should be 22 (3 + 4 + 5 + 10) and if the input array is
    {10, 5, 4, 3}, then output should be 10

 */

package dyanamicprogramming;

/**
 * Created by poorvank on 5/22/15.
 */
public class MaximumSumIncSubSeq {

    public static void main(String[] args) {

        int[] array = new int[]{10, 8, 4, 9};
        maxSequence(array);
    }


    private static void maxSequence(int[] array) {

        int[] sumArray = new int[array.length];

        System.arraycopy(array, 0, sumArray, 0, sumArray.length);

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && sumArray[i] < sumArray[j] + array[i]) {
                    sumArray[i] = sumArray[j] + array[i];
                }
            }
        }

        int max = 0;

        for (int aSumArray : sumArray) {
            if (max < aSumArray)
                max = aSumArray;
        }

        System.out.println(max);
    }

}

/*

Refer Longest Increasing Subsequence

 */
