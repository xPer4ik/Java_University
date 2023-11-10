package Task_20.Task_20_5;

public class Matrix<T> {
    private T[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = (T[][]) new Object[rows][columns];
    }

    public void setElement(int row, int column, T value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            data[row][column] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid matrix indices");
        }
    }

    public T getElement(int row, int column) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            return data[row][column];
        } else {
            throw new IndexOutOfBoundsException("Invalid matrix indices");
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        Matrix<T> result = new Matrix<>(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // В данном примере предполагается, что тип T поддерживает операцию сложения
                result.setElement(i, j, (T) addElements(this.getElement(i, j), other.getElement(i, j)));
            }
        }

        return result;
    }

    private T addElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a).intValue() + ((Number) b).intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(((Float) a).floatValue() + ((Number) b).floatValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a).doubleValue() + ((Number) b).doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }


    private T multiplyElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(((Integer) a).intValue() * ((Number) b).intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(((Float) a).floatValue() * ((Number) b).floatValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(((Double) a).doubleValue() * ((Number) b).doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
        }

        Matrix<T> result = new Matrix<>(this.rows, other.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                T sum = multiplyElements(this.getElement(i, 0), other.getElement(0, j));

                for (int k = 1; k < this.columns; k++) {
                    sum = addElements(sum, multiplyElements(this.getElement(i, k), other.getElement(k, j)));
                }

                result.setElement(i, j, sum);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Пример использования
        Matrix<Integer> matrix1 = new Matrix<>(3, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);
        matrix1.setElement(2, 0, 7);
        matrix1.setElement(2, 1, 8);
        matrix1.setElement(2, 2, 9);

        Matrix<Integer> matrix2 = new Matrix<>(3, 3);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(0, 2, 9);
        matrix2.setElement(1, 0, 10);
        matrix2.setElement(1, 1, 11);
        matrix2.setElement(1, 2, 12);
        matrix2.setElement(2, 0, 33);
        matrix2.setElement(2, 1, 54);
        matrix2.setElement(2, 2, 1);

        System.out.println("Matrix 1:");
        matrix1.displayMatrix();

        System.out.println("\nMatrix 2:");
        matrix2.displayMatrix();

        try {
            Matrix<Integer> sumMatrix = matrix1.add(matrix2);

            System.out.println("\nSum of matrices:");
            sumMatrix.displayMatrix();
        } catch (IllegalArgumentException e) {
            System.out.println("Matrix addition error: " + e.getMessage());
        }

        try {
            Matrix<Integer> productMatrix = matrix1.multiply(matrix2);

            System.out.println("\nProduct of matrices:");
            productMatrix.displayMatrix();
        } catch (IllegalArgumentException e) {
            System.out.println("Matrix multiplication error: " + e.getMessage());
        }


        // Пример использования  с другим типом
        Matrix<Double> matrix3 = new Matrix<>(2, 3);
        matrix3.setElement(0, 0, 1.5);
        matrix3.setElement(0, 1, 2.1);
        matrix3.setElement(0, 2, 3.3);
        matrix3.setElement(1, 0, 4.89);
        matrix3.setElement(1, 1, 5.4);
        matrix3.setElement(1, 2, 6.34);

        Matrix<Double> matrix4 = new Matrix<>(2, 3);
        matrix4.setElement(0, 0, 7.142);
        matrix4.setElement(0, 1, 8.714);
        matrix4.setElement(0, 2, -97.23);
        matrix4.setElement(1, 0, 10.253);
        matrix4.setElement(1, 1, 11.458);
        matrix4.setElement(1, 2, 12.512);

        System.out.println("Matrix 3:");
        matrix3.displayMatrix();

        System.out.println("\nMatrix 4:");
        matrix4.displayMatrix();

        try {
            Matrix<Double> sumMatrix2 = matrix3.add(matrix4);

            System.out.println("\nSum of matrices:");
            sumMatrix2.displayMatrix();
        } catch (IllegalArgumentException e) {
            System.out.println("Matrix addition error: " + e.getMessage());
        }
    }
}

