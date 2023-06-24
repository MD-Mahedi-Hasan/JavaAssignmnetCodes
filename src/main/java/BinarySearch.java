//4. Write a program that will find your key is found in the given array using binary search method
//        numbers=[1,6,9,3,5,4,7]
//        key=5

import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1,6,9,3,5,4,7};
        Arrays.sort(arr);
        int n = arr.length;
        int key = 5;
        int result = ob.binarySearch(arr, key);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }

    private int binarySearch(int[] arr, int x) {
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                if (arr[m] == x)
                    return m;
                if (arr[m] < x)
                    l = m + 1;
                else
                    r = m - 1;
            }
            return -1;
        }
    }
}

