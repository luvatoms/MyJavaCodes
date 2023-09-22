import java.util.*;

public class reversenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int m = n % 10;

            System.out.print(m);
            n = n / 10;

        }

    }
}