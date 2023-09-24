package StringQues;

public class question1 {
    public static void main(String args[]) {
        String str = "alWJDIUHXphaAAA";
        System.out.println(count(str));
    }

    public static int count(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                c++;
            }
        }
        return c;
    }
}
