import java.util.Arrays;

public class DeclarativeBasic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Declarative: i-sum tanan numbers
        int sum = Arrays.stream(numbers).sum();

        // Declarative: average sa tanan numbers
        double average = Arrays.stream(numbers).average().orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
