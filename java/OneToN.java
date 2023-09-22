import java.util.*;

public class OneToN {
    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your value : ");
            int n = sc.nextInt();
            
            if (n == 143) {
                System.out.println("hava a nice day");
                return;
            }
            printnum(n);
        }
    }

    public static void printnum(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        printnum(n - 1);
        System.out.println(n + " ");
    }
}
// import java.util.Scanner;

// public class InfiniteInputWithCondition {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// while (true) {
// System.out.print("Enter input: ");
// int input = scanner.nextInt();

// if (input == 143) {
// System.out.println("Input 143 detected. Breaking the input cycle.");
// break;
// }

// // Process the input or do something with it here
// System.out.println("You entered: " + input);
// }

// scanner.close();
// }
// }
