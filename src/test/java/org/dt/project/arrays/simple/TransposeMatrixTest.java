package org.dt.project.arrays.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    public void testSquareMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        int[][] result = TransposeMatrix.transpose(matrix);
        assertArrayEquals(expected, result, "Test square matrix transpose");
    }

    @Test
    public void testRectangularMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] expected = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        int[][] result = TransposeMatrix.transpose(matrix);
        assertArrayEquals(expected, result, "Test rectangular matrix transpose");
    }

    @Test
    public void testSingleRowMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4, 5}
        };
        int[][] expected = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };
        int[][] result = TransposeMatrix.transpose(matrix);
        assertArrayEquals(expected, result, "Test single row matrix transpose");
    }

    @Test
    public void testSingleColumnMatrix() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };
        int[][] expected = {
                {1, 2, 3, 4, 5}
        };
        int[][] result = TransposeMatrix.transpose(matrix);
        assertArrayEquals(expected, result, "Test single column matrix transpose");
    }

    @Test
    public void testEmptyMatrix() {
        int[][] matrix = new int[0][0];
        int[][] expected = new int[0][0];
        int[][] result = TransposeMatrix.transpose(matrix);
        assertArrayEquals(expected, result, "Test empty matrix transpose");
    }

    @Test
    public void testSingleElementMatrix() {
        int[][] matrix = {
                {1}
        };
        int[][] expected = {
                {1}
        };
        int[][] result = TransposeMatrix.transpose(matrix);
        assertArrayEquals(expected, result, "Test single element matrix transpose");
    }
}