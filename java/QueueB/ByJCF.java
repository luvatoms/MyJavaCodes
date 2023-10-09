package QueueB;//java collection framework

import java.util.*;

public class ByJCF {
  public static void main(String args[]) {
    //Queue q = new Queue();
    //by using LinkedList keyword
    //Queue<Integer>q = new LinkedList<>();//why we use LinkedList word there not Queue find it online
    // by using ArrayDeque
  Queue <Integer> q =  new ArrayDeque<>();
    

    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.remove());
    q.add(4);
    System.out.println(q.remove());
    q.add(5);
    // 1 2 3
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
