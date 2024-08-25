package org.dt.project.arrays.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSubsequenceTest {

    @Test
    public void testIsSubsequenceFound() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        boolean result = ValidateSubsequence.isSubsequence(array, sequence);
        assertTrue(result, "Sequence should be found");
    }

    @Test
    public void testIsSubsequenceNotFound() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, 10, -1);  // Wrong order
        boolean result = ValidateSubsequence.isSubsequence(array, sequence);
        assertFalse(result, "Sequence should not be found");
    }

    @Test
    public void testIsSubsequenceEmptySequence() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList();  // Empty sequence
        boolean result = ValidateSubsequence.isSubsequence(array, sequence);
        assertTrue(result, "Empty sequence should always be a subsequence");
    }

    @Test
    public void testIsSubsequenceEmptyArray() {
        List<Integer> array = Arrays.asList();  // Empty array
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        boolean result = ValidateSubsequence.isSubsequence(array, sequence);
        assertFalse(result, "Non-empty sequence cannot be found in an empty array");
    }

    @Test
    public void testIsSubsequenceSingleElement() {
        List<Integer> array = Arrays.asList(5);
        List<Integer> sequence = Arrays.asList(5);  // Exact match
        boolean result = ValidateSubsequence.isSubsequence(array, sequence);
        assertTrue(result, "Single element sequence should be found");
    }

    @Test
    public void testIsSubsequencePartialMatch() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 22, 25);
        boolean result = ValidateSubsequence.isSubsequence(array, sequence);
        assertTrue(result, "Partial sequence should be found");
    }
}