public class ImperativeBasic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Imperative: sum using loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Imperative: compute average
        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

