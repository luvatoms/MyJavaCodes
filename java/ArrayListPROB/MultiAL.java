package ArrayListPROB;

import java.util.ArrayList;

public class MultiAL {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list2.add(3);
        list1.add(4);
        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);
        System.out.println(list);
        
        System.out.println(list.get(0)+list.get(1));

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> curr = mainlist.get(i);//.get fn se sirf elements print hotai hai bracket nhi hotai print 
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }

}
