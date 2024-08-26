package org.dt.project.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        List<Integer[]> result = new ArrayList<>();
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        for(int i=0; i<sortedArray.length-2; i++) {
            int left = i+1;
            int right = sortedArray.length-1;
            int current = sortedArray[i];


            while(left < right) {
                int leftVal = sortedArray[left];
                int rightVal = sortedArray[right];

                if(targetSum == (current + leftVal + rightVal)) {
                    result.add(new Integer[]{current, leftVal, rightVal});
                    left++;
                } else if(targetSum < (current + leftVal + rightVal)) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }

        return result;
    }
}
