package Stacks;

import java.util.*;

public class DuplicateParan {//tc -->O(n)

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening , operator ,operands
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate

                } else {
                    s.pop();// opening pair
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        //always the valid string
        String str = "((a+b))";
        String str2 = "(a+b)";
        System.out.println(isDuplicate(str2));
    }
}
//dry run