package ArrayListPROB;//by using 2 pointer appraoch

import java.util.*;

public class Mwater {
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mw(height));
    }

    // 2 pointer approach
    public static int mw(ArrayList<Integer> height) {
        int maxW = 0;
        int si = 0;
        int ei = height.size() - 1;
        while (si < ei) {
            // cal water area
            int ht = Math.min(height.get(ei), height.get(si));
            int width = ei - si;
            int currW = ht * width;
            maxW = Math.max(maxW, currW);
            // update ptr
            if (height.get(si) < height.get(ei)) {
                si++;
            } else {
                ei--;
            }

        }
        return maxW;

    }
}
