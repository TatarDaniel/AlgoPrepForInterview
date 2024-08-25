package org.dt.project.arrays.simple;

import java.util.List;

/*

Overall Time Complexity:
    The worst-case scenario is when we iterate through the entire array without fully matching the sequence, resulting in a time complexity of O(n).
Overall Space Complexity:
    The space complexity is O(1), meaning the algorithm uses a constant amount of extra space regardless of the input size.

 */

public class ValidateSubsequence {
    public static boolean isSubsequence(List<Integer> array, List<Integer> sequence) {

        if(sequence.isEmpty())
            return true;

        int pointer = 0;

        for(int nums : array){
            if(nums == sequence.get(pointer)){
                pointer++;
                if(pointer == sequence.size()){
                    return true;
                }
            }
        }

        return false;
    }
}
