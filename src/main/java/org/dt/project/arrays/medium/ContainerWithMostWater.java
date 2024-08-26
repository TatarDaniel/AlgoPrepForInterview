package org.dt.project.arrays.medium;

public class ContainerWithMostWater {
    public static int maxWater(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;

        while (left < right) {
            area = Math.max(area, (Math.min(height[left], height[right]) * Math.abs(right - left)));

            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return area;
    }
}
