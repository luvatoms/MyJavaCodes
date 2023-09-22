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

// }