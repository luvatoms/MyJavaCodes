
import java.util.*;
//there is an error in inner loop to find it solve with pen paper or maybe it is compiler error 
 public class pairarray {
    public static void pairS(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr +","+ num[j]+")");
            }System.out.println();
        }

    }

    public static void main(String args[]) {
        int n[] = {2,4,6,8,10};
        pairS(n);
    }
}
