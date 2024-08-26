package org.dt.project.arrays.simple;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return matrix;

        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[0].length; col++) {
                transposeMatrix[col][row] = matrix[row][col];
            }
        }

        return transposeMatrix;

    }
}
