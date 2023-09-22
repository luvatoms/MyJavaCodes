//WAF to find the first occurence of an element in an array
public class problem1 {
    public static void main(String args[]) {
        int m[] = { 1, 2, 3, 4, 45 };
        System.out.println(findkey(m, 45, 0));
    }

    public static int findkey(int arr[], int key, int i) {
        // ye wali
        if (i == arr.length - 1 && arr[i] != key) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return findkey(arr, key, i + 1);
    }
}

// batch mai ye glt hai unhone ek cond miss kr di