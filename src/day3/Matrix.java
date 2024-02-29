package day3;

public class Matrix {

    public static void main(String[] args) {

    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix[row].length; ++col) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix[row].length; ++col) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] aad(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] result = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix1[row].length; ++col) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        }
        return null;
    }

    public static double[][] aad(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] result = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix1[row].length; ++col) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        }
        return null;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] result = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix1[row].length; ++col) {
                    result[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return result;
        }
        return null;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] result = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix1[row].length; ++col) {
                    result[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return result;
        }
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length == matrix2.length) {
            int[][] result = new int[matrix1.length][matrix2[0].length];
            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix2[0].length; ++col) {
                    result[row][col] = 0;
                    for (int idx = 0; idx < matrix1[0].length; ++idx) {
                        result[row][col] += matrix1[row][idx] * matrix2[idx][col];
                    }
                }
            }
            return result;
        }
        return null;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length == matrix2.length) {
            double[][] result = new double[matrix1.length][matrix2[0].length];
            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix2[0].length; ++col) {
                    result[row][col] = 0;
                    for (int idx = 0; idx < matrix1[0].length; ++idx) {
                        result[row][col] += matrix1[row][idx] * matrix2[idx][col];
                    }
                }
            }
            return result;
        }
        return null;
    }

}
