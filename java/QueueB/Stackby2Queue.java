package QueueB;

import java.util.*;

public class Stackby2Queue {

  static class Stack {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty() {
      // Check if both queues are empty to determine if the stack is empty
      return q1.isEmpty() && q2.isEmpty();
    }

    // Add elements to the stack
    public void push(int data) {//O(1)
      // Use q2 if q1 is not empty, and vice versa
      if (!q2.isEmpty()) {
        q2.add(data);
      } else {
        q1.add(data);
      }
    }

    public int pop() {//O(n)
      if (isEmpty()) {
        System.out.println("empty stack");
        return -1;
      }
      int top = -1;
      // Case 1: q1 is not empty
      if (!q1.isEmpty()) {
        while (!q1.isEmpty()) {
          top = q1.remove();
          if (q1.isEmpty()) {
            break;
          }
          q2.add(top);
        }
      }
      // Case 2: q2 is not empty
      else {
        while (!q2.isEmpty()) {
          top = q2.remove();
          if (q2.isEmpty()) {
            break;
          }
          q1.add(top);
        }
      }
      return top;
    }

    public int peek() {//O(n)
      if (isEmpty()) {
        System.out.println("empty stack");
        return -1;
      }
      int top = -1;
      // Case 1: q1 is not empty
      if (!q1.isEmpty()) {
        while (!q1.isEmpty()) {
          top = q1.remove();
          q2.add(top);
        }
      }
      // Case 2: q2 is not empty
      else {
        while (!q2.isEmpty()) {
          top = q2.remove();
          q1.add(top);
        }
      }
      return top;
    }
  }

  public static void main(String args[]) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
