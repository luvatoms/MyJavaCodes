package fnProb;

import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number");
        int num = sc.nextInt();
        pal(num);

    }

    public static void pal(int number) {
        int orinum = number;
        int rev = 0;
        while (number != 0) {
            int rem = number % 10;// to take last digit

            rev = rev * 10 + rem;// here just solve it in paper pen to get understand
            number = number / 10;// to remove the last last digit
        }
        if (orinum == rev) {
            System.out.print("number is paliindrome");

        } else {
            System.out.print("not a palindrome");
        }

    }
}
