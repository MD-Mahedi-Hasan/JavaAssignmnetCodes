//11. Find out the second largest element of the given array
//        numbers=[5,3,9,7,4,1,8]
public class SecondLargestElement {
        public static void main(String[] args) {
            int[] numbers = { 5, 3, 9, 7, 4, 1, 8 };
            int secondLargest = findSecondLargest(numbers);

            System.out.println("The second largest element is: " + secondLargest);
        }

        private static int findSecondLargest(int[] numbers) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    secondLargest = largest;
                    largest = numbers[i];
                } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                    secondLargest = numbers[i];
                }
            }

            return secondLargest;
        }
}