package Stacks;
//reverse a String using stack
import java.util.*;

public class QUEST2 {
public static String reverseString(String str){
Stack<Character>s=new Stack<>();
int idx = 0;
while(idx<str.length()){
    s.push(str.charAt(idx));
    idx++;
}
StringBuilder result = new StringBuilder("");
while(!s.isEmpty()){
    char curr = s.pop();
    result.append(curr);

}
return result.toString();
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println(reverseString(str));
}
}
//done
