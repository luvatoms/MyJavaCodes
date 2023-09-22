package Backtracing;

public class Permutation {
    public static void main(String args[]){
        String str = "abc";
         FindPer(str, "");
    }
    public static void FindPer(String str, String ans){
          //base case
          if(str.length()==0){
            System.out.println(ans);
            return;
          }

          //kaam or recursion 

          for(int i = 0;i<str.length();i++)
        {
          char curr = str.charAt(i); 
          //"abcde" => "ab"+"de"="abde"
         String Newstr = str.substring(0, i) + str.substring(i+1);
          FindPer(Newstr,ans+curr);
        }
          
    }
}
//time complexity is TC = O(n*n!)
