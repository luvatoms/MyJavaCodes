package notedbypractice;

import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();// after upper double input we must write to this line as it intrupts the very
                        // first next line to make it invalid
        String s = scan.nextLine();

        System.out.println("String s wala: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
