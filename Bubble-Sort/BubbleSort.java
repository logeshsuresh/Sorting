import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i ++) {
            boolean isSwapped = false;
            for(int j = 0; j < n - i - 1; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) { return; }

        }
    }
    public static void main(String[] args) {
        int[] arr = {15, 1, 6, 3, -1, 2, 10};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}