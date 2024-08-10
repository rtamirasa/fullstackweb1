import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        cyclicSort(arr);
        System.out.println("\n"); // Corrected from /n to \n
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapArr(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swapArr(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
