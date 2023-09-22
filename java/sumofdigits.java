import java.util.*;

public class sumofdigits {
    public static void main(String args[]) {
int num = 5;
        sod(num);

    }

    public static void sod(int n) {
        int sods = 0;
        int digits = n;
        while (digits > 0) {

            int rem = digits % 10;
            sods = sods + rem;
            digits = digits / 10;

        }
        System.out.print("sum of the digits are " + sods);

    }

}
