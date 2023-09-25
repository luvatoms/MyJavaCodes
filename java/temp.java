// //write a program to check wether a number is palindrome or not

// import java.util.*;

// public class temp {
//     public static void ispalindrome(int n) {
//         int rev = 0;
//         int temp = n;
//         while (temp > 0) {
//             int lastdigit = temp % 10;
//             rev = (rev * 10) + lastdigit;
//             temp = temp / 10;
//         }
//         if (rev == n) {
//             System.out.println("palindrome number");
//         } else {
//             System.out.println("not a palindrome number");
//         }
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("enter your number: ");
//         int n = s.nextInt();
//         ispalindrome(n);
//     }

public class temp {
    public static void findlength(String name, int count, char arr[], int i) {
        if (i == arr.length) {
            System.out.println(count);
            return;
        }
        findlength(name, count + 1, arr, i + 1);


    }

    public static void main(String[] args) {
        String name = "shrut";
        char arr[] = name.toCharArray();
        int count = 0;
       findlength(name, count, arr, 0);

    }
}