package org.dt.project.arrays.medium;


/*
Overall Time Complexity 0(n)
Overall Space Complexity O(1)
 */

public class MonotonicArray {
    public static boolean monotonic(final int[] array) {


        if(array == null || array.length == 0 || array.length == 1){
            return true;
        }

        if(array[0] <= array[array.length-1]){
            for(int i=0; i<array.length-1; i++){
                if(array[i] > array[i+1]){
                    return false;
                }
            }
        }

        if(array[0] >= array[array.length-1]){
            for(int i=0; i<array.length-1; i++){
                if(array[i] < array[i+1]){
                    return false;
                }
            }
        }

        return true;
    }
}
