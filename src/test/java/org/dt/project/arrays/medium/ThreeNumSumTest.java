package org.dt.project.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeNumSumTest {

    @Test
    public void testThreeNumberSumFound() {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[]{-8, 2, 6});
        expected.add(new Integer[]{-8, 3, 5});
        expected.add(new Integer[]{-6, 1, 5});

        List<Integer[]> result = ThreeNumSum.threeNumberSum(array, targetSum);

        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i), "Triplet elements should match expected");
        }
    }

    @Test
    public void testThreeNumberSumNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int targetSum = 100;
        List<Integer[]> expected = new ArrayList<>();

        List<Integer[]> result = ThreeNumSum.threeNumberSum(array, targetSum);

        assertEquals(expected.size(), result.size(), "No triplets should be found");
    }

    @Test
    public void testThreeNumberSumWithDuplicates() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int targetSum = 9;
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[]{1, 2, 6});
        expected.add(new Integer[]{1, 3, 5});
        expected.add(new Integer[]{2, 3, 4});

        List<Integer[]> result = ThreeNumSum.threeNumberSum(array, targetSum);

        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i), "Triplet elements should match expected");
        }
    }

    @Test
    public void testThreeNumberSumEmptyArray() {
        int[] array = {};
        int targetSum = 0;
        List<Integer[]> expected = new ArrayList<>();

        List<Integer[]> result = ThreeNumSum.threeNumberSum(array, targetSum);

        assertEquals(expected.size(), result.size(), "No triplets should be found for an empty array");
    }

    @Test
    public void testThreeNumberSumSingleTriplet() {
        int[] array = {-1, 0, 1, 2, -4};
        int targetSum = 0;
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[]{-1, 0, 1});

        List<Integer[]> result = ThreeNumSum.threeNumberSum(array, targetSum);

        assertEquals(expected.size(), result.size(), "Number of triplets found should match expected");
        for (int i = 0; i < result.size(); i++) {
            assertArrayEquals(expected.get(i), result.get(i), "Triplet elements should match expected");
        }
    }

    @Test
    public void testThreeNumberSumNoValidTriplet() {
        int[] array = {1, 2, 3};
        int targetSum = 10;
        List<Integer[]> expected = new ArrayList<>();

        List<Integer[]> result = ThreeNumSum.threeNumberSum(array, targetSum);

        assertEquals(expected.size(), result.size(), "No triplets should be found as no valid triplet exists");
    }
}