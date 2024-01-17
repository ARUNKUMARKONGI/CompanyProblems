import java.util.Arrays;

public class BinarySearchInbuilt{
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 42, 50};
        int key = 16;
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
/*
    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  //to reduce integer overflow

            if (arr[mid] == key) {
                return mid; // Element found, return its index
            } else if (arr[mid] < key) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }*/
