package org.dt.project.arrays.simple;

/*
Time Complexity: O(n) because we only pass through the array once with the two-pointer technique.
Space Complexity: O(n) due to the additional squareArray that stores the squared values.
 */

public class SortedSquareArray {
    public static int[] sortedSquaredArray(final int[] array) {

        int[] squared = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        int position = array.length - 1;

        while(left <= right){
            int leftSquare = array[left] * array[left];
            int rightSquare = array[right] * array[right];

            if(leftSquare > rightSquare){
                squared[position] = leftSquare;
                left++;
            }
            else {
                squared[position] = rightSquare;
                right--;
            }
            position--;
        }

        return squared;
    }
}
