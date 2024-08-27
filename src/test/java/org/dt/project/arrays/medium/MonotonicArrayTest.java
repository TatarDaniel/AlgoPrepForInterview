package org.dt.project.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    @Test
    public void testMonotonic_increasing() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_decreasing() {
        int[] array = {5, 4, 3, 2, 1};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_allEqual() {
        int[] array = {2, 2, 2, 2, 2};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_notMonotonic() {
        int[] array = {1, 3, 2, 4, 5};
        assertFalse(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_emptyArray() {
        int[] array = {};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_singleElement() {
        int[] array = {1};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_twoElements_increasing() {
        int[] array = {1, 2};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_twoElements_decreasing() {
        int[] array = {2, 1};
        assertTrue(MonotonicArray.monotonic(array));
    }

    @Test
    public void testMonotonic_twoElements_equal() {
        int[] array = {2, 2};
        assertTrue(MonotonicArray.monotonic(array));
    }
}