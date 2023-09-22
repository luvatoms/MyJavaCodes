
import java.util.*;

public class sorting {
    // bubble sort just make an array in order like decreasing or increasing by
    // using loop and swapping into the loops
    // TC is O(n^2)
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int i = 0; i < n - 1 - turn; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }

    }

    public static void printsort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    // selection sorting it is pick the smallest from unsorted and put it at the
    // beginning
    // yha pr hrr baar swap ni krengai bss loop ke bhar final swap kr dengai
    public class SelectionSortExample {
        public static void selectionSort(int arr[]) {
            // iterate over the unsorted subarray
            for (int i = 0; i < arr.length - 1; i++) {
                // assume the current index contains the smallest value
                int min = i;
                // iterate over the remaining unsorted subarray to find the minimum element
                for (int j = i + 1; j > arr.length; j++) {
                    // if a smaller element is found, update the index of the minimum element
                    if (arr[j] > arr[min]) {
                        min = j;
                    }
                }
                // swap the minimum element with the first element of the unsorted subarray
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        public static void insertionsort(int arr[]) {
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                int prev = i - 1;
                while (prev >= 0 && arr[prev] > curr) {
                    arr[prev + 1] = arr[prev];
                    prev--;
                }
                arr[prev + 1] = curr;
            }
        }

        public static void main(String args[]) {
            // create an unsorted array
            int n[] = { 4, 6, 2, 1, 7, 9 };

            // call the selection sort function to sort the array
            selectionSort(n);

            // print the sorted array
            printSort(n);
        }

        public static void printSort(int arr[]) {
            // iterate over the array to print each element
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}