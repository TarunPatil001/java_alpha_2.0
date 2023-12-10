public class DividenConquer {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /* *************** Merge Sort ***************** */

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    /* *************** Quick Sort ***************** */
    // public static void quickSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }

    // int pidx = partion(arr, si, ei);
    // quickSort(arr, si, pidx - 1);
    // quickSort(arr, pidx + 1, ei);
    // }

    // public static int partion(int arr[], int si, int ei) {
    // int pivot = arr[ei];
    // int i = si - 1;

    // for (int j = si; j < ei; j++) {
    // if (arr[j] <= pivot) {
    // i++;

    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // }
    // }
    // i++;

    // int temp = pivot;
    // arr[ei] = arr[i];
    // arr[i] = temp;
    // return i;
    // }

    public static void main(String args[]) {
        int arr[] = { 6, 3, -9, 2, 8, 1 };
        mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}