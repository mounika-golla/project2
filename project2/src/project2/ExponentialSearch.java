package project2;

public class ExponentialSearch {

    static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

    static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetValue = 8;

        int result = exponentialSearch(array, targetValue);

        if (result != -1) {
            System.out.println("Target value found at index: " + result);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
}



