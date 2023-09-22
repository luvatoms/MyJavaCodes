import java.util.*;

public class palindrome2 {
    public static boolean palind(String word) {
        int i;
        for (i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                return true;

            }
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        System.out.println(palind(word));
    }
}
