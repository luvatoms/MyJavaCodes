package questionARRAY;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinc
public class prob1 {//to check repeating elements
    public static void main(String args[]) {
int arr[]={1,2,3,4};
System.out.println(check(1, arr));
    }
//brute force approach
    public static boolean check(int key, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }

            }
        }
        return false;
    }
}
