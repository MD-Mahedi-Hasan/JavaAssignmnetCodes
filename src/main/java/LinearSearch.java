//5. Write a program that will find your key is found in the given array using linear search method
//        numbers=[1,6,9,3,5,4,7]
//        key=5

public class LinearSearch {

        public static void main(String args[]) {
            int arr[] = {1,6,9,3,5,4,7};
            int key = 5;

            int result = search(arr, arr.length, key);
            if (result == -1)
                System.out.print(
                        "Element is not present in array");
            else
                System.out.print("Element is present at index "
                        + result);
        }
        public static int search(int arr[], int N, int key) {
                for (int i = 0; i < N; i++) {
                    if (arr[i] == key)
                        return i;
                }
                return -1;
            }
}