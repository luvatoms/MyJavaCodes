import java.util.*;//done 

public class inbuildsort {
  public static void main(String args[]) {
    int n[] = { 4, 6, 2, 1, 7, 9 };
    Arrays.sort(n, 0, 4);
    printSort(n);

  }



public static void printSort(int arr[]) {
        // iterate over the array to print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    

}}