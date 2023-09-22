package Backtracing;
//find the all subset of a string using backtracking 
public class subString {
    public static void main(String args[]) {
        String str = "abc";
        SubString(str, "", 0);
    }

    public static void SubString(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }
        // yes choice
        SubString(str, ans + str.charAt(i), i + 1);
        // no choice
        SubString(str, ans, i + 1);
    }
}
 