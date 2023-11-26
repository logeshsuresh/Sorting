import java.util.Arrays;

public class SelectionSort {

    // this function returns the minimum element in arr in the range [start, n-1] where n = length(arr)
    public static int getMinimumIndex(int[] arr, int start) {
        int minimumIndex = start, n = arr.length;
        for(int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minimumIndex]) {
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    // this function does selection sort on an array -> increasing order
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i ++) {
            int minIndex = getMinimumIndex(arr, i);
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {15, 1, 6, 3, -1, 2, 10};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}