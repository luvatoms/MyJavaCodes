package ArrayListPROB;

import java.util.*;

//container with most water=
//for given n lines of x axis use 2 lines to form a
//container ie.it holds maximum water
public class Prob1 {
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
        System.out.println(storeW(height));
}

    public static int storeW(ArrayList<Integer> height) {
        int maxW = 0;
        // brute force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - 1;
                int curr = ht * width;
                maxW = Math.max(maxW, curr);
            }
        }
        return maxW;
    }

}
