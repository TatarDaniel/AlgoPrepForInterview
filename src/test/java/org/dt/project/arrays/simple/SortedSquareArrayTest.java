package org.dt.project.arrays.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquareArrayTest {

    @Test
    public void testSortedSquaredArrayWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with all positive numbers");
    }

    @Test
    public void testSortedSquaredArrayWithNegativeNumbers() {
        int[] array = {-5, -4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16, 25};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with all negative numbers");
    }

    @Test
    public void testSortedSquaredArrayWithMixedNumbers() {
        int[] array = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with mixed negative and positive numbers");
    }

    @Test
    public void testSortedSquaredArrayWithZeros() {
        int[] array = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with zeros in the array");
    }

    @Test
    public void testSortedSquaredArrayWithSingleElement() {
        int[] array = {7};
        int[] expected = {49};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with a single element");
    }

    @Test
    public void testSortedSquaredArrayWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with an empty array");
    }

    @Test
    public void testSortedSquaredArrayWithDuplicates() {
        int[] array = {-2, -2, 0, 2, 2};
        int[] expected = {0, 4, 4, 4, 4};
        int[] result = SortedSquareArray.sortedSquaredArray(array);
        assertArrayEquals(expected, result, "Test with duplicates in the array");
    }
}