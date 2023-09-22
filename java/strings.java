import java.util.*;

public class strings {
    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c' };
        String str = "abc";
        String str2 = new String("xyz");
        // stirngs are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        // concatenation = sum of two or more strings

        String firstname;
        firstname = sc.next();
        String lastname;
        lastname = sc.next();
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
    }
}