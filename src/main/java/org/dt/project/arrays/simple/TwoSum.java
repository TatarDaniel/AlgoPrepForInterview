package org.dt.project.arrays.simple;

/*

Time Complexity: O(n)
    The algorithm processes each element of the array exactly once, leading to a linear time complexity.
Space Complexity: O(n)
    The space required by the HashSet grows linearly with the number of elements in the array, leading to linear space complexity.

 */

import java.util.HashSet;

public class TwoSum {
    public static int[] twoSums(int[] array, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        if(array == null || array.length == 0)
            return new int[0];

        for(int i = 0; i < array.length; i++){
            if(set.contains(targetSum - array[i])){
                return new int[] {array[i], targetSum-array[i]};
            }
            set.add(array[i]);
        }

        return new int[0];
    }
}
