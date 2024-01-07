package TASK_3;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            System.out.println("Для сложения матрицы на матрицу,они должны иметь иметь одинаковые размеры");
            return null;
        }

        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return new Matrix(result);
    }

    public Matrix multiply(double scalar) {
        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.matrix[i][j] * scalar;
            }
        }

        return new Matrix(result);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix1Data = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        double[][] matrix2Data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix matrix1 = new Matrix(matrix1Data);
        Matrix matrix2 = new Matrix(matrix2Data);

        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("Matrix 2:");
        matrix2.print();

        Matrix resultAddition = matrix1.add(matrix2);
        if (resultAddition != null) {
            System.out.println("Result of addition:");
            resultAddition.print();
        }

        double scalar = 4.7;
        Matrix resultMultiplication = matrix1.multiply(scalar);
        System.out.println("Result of multiplication by a scalar (" + scalar + "):");
        resultMultiplication.print();
    }
}
