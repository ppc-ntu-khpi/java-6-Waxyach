import java.util.Arrays;

public class FibonacciMatrixGenerator {

    /**
     * Генерує матрицю розміром N x M, заповнену числами, де кожне наступне
     * є сумою двох попередніх. Перші два елементи дорівнюють 1.
     *
     * @param rows кількість рядків матриці (N).
     * @param cols кількість стовпців матриці (M).
     * @return двовимірний масив типу long (щоб уникнути швидкого переповнення).
     * @throws IllegalArgumentException якщо розміри матриці некоректні.
     */
    public static long[][] generateFibonacciMatrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix size cannot be less than zero!");
        }

        int totalElements = rows * cols;
        long[] flatSequence = new long[totalElements];

        Arrays.setAll(flatSequence, i -> {
            if (i == 0 || i == 1) {
                return 1L;
            }
            return flatSequence[i - 1] + flatSequence[i - 2];
        });

        long[][] matrix = new long[rows][cols];

        Arrays.setAll(matrix, i ->
                Arrays.copyOfRange(flatSequence, i * cols, (i * cols) + cols)
        );

        return matrix;
    }
}