package org.dt.project.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {

    @Test
    public void testMoveElementToEnd_basic() {
        List<Integer> input = Arrays.asList(2, 1, 2, 2, 3, 4, 2);
        List<Integer> expected = Arrays.asList(4, 1, 3, 2, 2, 2, 2);
        List<Integer> result = MoveElementToEnd.moveElementToEnd(input, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testMoveElementToEnd_noElementsToMove() {
        List<Integer> input = Arrays.asList(1, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        List<Integer> result = MoveElementToEnd.moveElementToEnd(input, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testMoveElementToEnd_allElementsToMove() {
        List<Integer> input = Arrays.asList(2, 2, 2, 2);
        List<Integer> expected = Arrays.asList(2, 2, 2, 2);
        List<Integer> result = MoveElementToEnd.moveElementToEnd(input, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testMoveElementToEnd_emptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> result = MoveElementToEnd.moveElementToEnd(input, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testMoveElementToEnd_elementNotPresent() {
        List<Integer> input = Arrays.asList(1, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        List<Integer> result = MoveElementToEnd.moveElementToEnd(input, 6);
        assertEquals(expected, result);
    }

}