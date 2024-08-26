package org.dt.project.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void maxWaterCase1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test case 1");
    }

    @Test
    void maxWaterCase2() {
        int[] height = {2,3,6,7,9,4,8,1};
        int expected = 24;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test case 2");
    }

    @Test
    public void testAllSameHeight() {
        int[] height = {5, 5, 5, 5, 5, 5};
        int expected = 25;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with all elements having the same height");
    }

    @Test
    public void testAscendingHeight() {
        int[] height = {1, 2, 3, 4, 5, 6};
        int expected = 9;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with heights in ascending order");
    }

    @Test
    public void testDescendingHeight() {
        int[] height = {6, 5, 4, 3, 2, 1};
        int expected = 9;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with heights in descending order");
    }

    @Test
    public void testSinglePeak() {
        int[] height = {1, 3, 2, 5, 2, 3, 1};
        int expected = 12;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with a single peak in the middle");
    }

    @Test
    public void testTwoEqualPeaks() {
        int[] height = {1, 8, 6, 2, 5, 8, 3, 7};
        int expected = 42;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with two equal peaks");
    }

    @Test
    public void testMinimumSize() {
        int[] height = {1, 2};
        int expected = 1;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with the minimum size input");
    }

    @Test
    public void testEmptyArray() {
        int[] height = {};
        int expected = 0;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with empty array");
    }

    @Test
    public void testSingleElementArray() {
        int[] height = {5};
        int expected = 0;
        assertEquals(expected, ContainerWithMostWater.maxWater(height), "Test with single element array");
    }
}