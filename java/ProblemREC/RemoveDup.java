package ProblemREC;

//remove duplication string range will be a to z
//appnnacollege 
public class RemoveDup {
    public static void main(String args[]) {
        String str = "apnaaacollegge";
        removeduplicates(str, 0, new StringBuilder(""),new boolean[26]);

    }

    public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            //duplicate
            removeduplicates(str, idx + 1, newStr, map);
        } else {//yha pr true bna re hai jo phli baar aaya hai 
            map[currChar - 'a'] = true;
            removeduplicates(str, idx + 1, newStr.append(currChar), map);

        }
    }

}
//home analyse stack ;