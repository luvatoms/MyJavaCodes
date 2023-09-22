
public class MergeSort {
    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        Mergesor(arr, 0, arr.length - 1);
        System.out.print("sorted array is = ");Printarr(arr);
    }
    public static void Mergesor(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        Mergesor(arr, si, mid);// left part
        Printarr(arr);//see the changes
        System.out.println("-----------");
        Mergesor(arr, mid + 1, ei);// right part
        Printarr(arr);//see the changes 
        merge(arr, si, mid, ei);//isko hta kr dekh kya hota hai 

    }
// arrange the unsorted to sorted
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;//iterator for left part
        int j = mid + 1;//iterator for right part
        int k = 0;//iterator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;//to acess next empty temp array
        }
        // left part remaining value if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover right elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
