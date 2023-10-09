package QueueB;//Queue using LinkedList

public class QUEUEbyLL {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {

static Node head = null;
static Node tail = null;

    public boolean isEmpty() {
      return head==null && tail==null;
    }



    // add
    public void add(int data) { //O(1)
     Node newNode = new Node(data);
     if(head == null ){
        head = tail = newNode;
        return;
     }
     else {
      tail.next = newNode;
      tail = newNode;
     }
    }

    //remove
    public int remove() { //O(1)
      if (isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      int front = head.data;
      if(tail==head){
        tail=head=null;
      }
      else{
      head = head.next;
      }
      return front;
    }

    // peek
    public int peek() { // O(1)
      if (isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      return head.data;
    }
  }

  public static void main(String args[]) {
    Queue q = new Queue();
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
