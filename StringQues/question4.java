package StringQues;

import java.util.*;

public class question4 {
    public static void main(String args[]) {
        String str1 = "care";
        String str2 = "rade";
        System.out.println(anagram(str1, str2));
    }

    public static boolean anagram(String str1, String str2) {
        boolean count = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count = true;
                    if(count==true){
                        return true;
                    }
                }

            }

        }
        return false;
    }
}
