//6. Generate random 10 integer numbers in an array and print out all the numbers
// from array and also print the max and min number from the array
import java.util.Arrays;
import java.util.Random;

public class RandomMaxMin {
    public static void main(String[] args) {
        int numbers[] = generateRandomNumbers(10);

        System.out.println("Generated Numbers: " + Arrays.toString(numbers));

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);

    }

    public static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(100);
        }

        return numbers;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
