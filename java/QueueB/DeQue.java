package QueueB;
import java.util.*;


public class DeQue {
     public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
       
         deque.addFirst(1); deque.addFirst(2); deque.addFirst(3);
         System.out.println(deque);
     }
}
