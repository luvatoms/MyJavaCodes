package ArrayListPROB;

import java.util.*;

//list = 1,2,3,4,5,6 target = 5
//note list is sorted
public class pairSum {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(pairSum1(list, 5));
    }

    // by using 2 pointer approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;

            } else {
                // case 3
                rp--;
            }

        }
        return false;
    }
}