
public class SortREC {
    public static void main(String args[]) {

        int m[] = { 1, 2, 3, 4, 45 };
        System.out.println(isSorted(m, 0));

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 11]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
}
//do stack analysis.