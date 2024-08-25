package org.dt.project.arrays.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSumsFoundCase1() {
        int[] array = {3, 9, 4, 8, 2, 6, 1, 7};
        int target = 9;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase2() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase3() {
        int[] array = {4, 6, 1, -3};
        int target = 3;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 17;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int target = 18;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase6() {
        int[] array = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int target = -5;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase7() {
        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int target = 163;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 2, result.length);
        assertEquals("The sum of the two elements should be equal to target", result[0] + result[1], target);
    }

    @Test
    public void testTwoSumsFoundCase8() {
        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int target = 164;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 0, result.length);
    }

    @Test
    public void testTwoSumsFoundCase9() {
        int[] array = {14};
        int target = 15;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 0, result.length);
    }

    @Test
    public void testTwoSumsFoundCase10() {
        int[] array = {};
        int target = 15;
        int[] result = TwoSum.twoSums(array, target);
        assertNotNull("Result should not be null", result);
        assertEquals("Result should have length 2", 0, result.length);
    }

}