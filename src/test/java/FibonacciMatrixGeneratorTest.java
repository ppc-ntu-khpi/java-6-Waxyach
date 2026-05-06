import java.util.Arrays;

void main() {
    IO.println("""
            
            Due to the exponential growth of Fibonacci numbers,
            matrices with number of elements > 92 will overflow long type.
            """);

    int rows = Integer.parseInt(IO.readln("Enter number of rows: "));
    int columns = Integer.parseInt(IO.readln("Enter number of columns: "));

    IO.println("Fibonacci Matrix Generator\n");
    IO.println(String.format("Matrix size: %d x %d\n", rows, columns));

    long[][] resultMatrix = FibonacciMatrixGenerator.generateFibonacciMatrix(rows, columns);

    Arrays.stream(resultMatrix)
            .map(Arrays::toString)
            .forEach(System.out::println);
}