import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; // this is the max item in the remaining array
            int maxIndex = getMaxindex(arr, 0, last);
            swappArr(arr, maxIndex, last);
        }
    }

    private static int getMaxindex(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) { // Include 'last' index in the loop
            if (arr[i] > arr[max]) { // Compare with arr[max], not max
                max = i;
            }
        }
        return max;
    }

    public static void swappArr(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort(int[] arr) {
        //forcus on outer loop length of arr -1
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swappArr(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
