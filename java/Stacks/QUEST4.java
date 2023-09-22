package Stacks;

import java.util.*;
//next greater element to right element

//the nge of some element x in an array is the first greater
//element that is to the right of x in same array
//arr = [6,8,0,1,3]
//next greater = [8,-1,1,3,-1] -ve means there is no other next greater element in array

public class QUEST4 {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if - else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // 3 push in stack
            s.push(i);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }

    }
}
// not done dry run it
// nxt greater right
// nxt greater left
// nxt smaller left
// nxt smaller right