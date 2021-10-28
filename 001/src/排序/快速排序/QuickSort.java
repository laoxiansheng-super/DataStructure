package 排序.快速排序;/*

 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 4, 12, 13};
        QuickSort.sort(arr, 0, arr.length - 1);
    }
    public static void sort(int[] arr, int a, int b) {
        int l = a;
        int r = b;
        int m = arr[a + b / 2];
        while (l < r) {
            while (l < m) {
                l++;
            }
            while (r > m) {
                r--;
            }
            if (l >= r) {
                break;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }

    }


}
