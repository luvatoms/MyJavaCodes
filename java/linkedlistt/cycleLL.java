package linkedlistt;

public class cycleLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;// next node will be null
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // to add we have T.C =O(1)-contant tc
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 =newNode =head
        newNode.next = head;// link step
        // step 3
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {// O(n)
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp-->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        int val = head.data;
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            tail = head = null;
            size = 0;
            return val;
        }

        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) {// O(n )
        Node temp = head;// starting point from head
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {// key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helper(Node head, int key) {// O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;// backtracing process
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head; // Start from the head
        Node next;

        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the link to the previous node
            prev = curr; // Move prev to the current node
            curr = next; // Move curr to the next node
        }

        head = prev; // Update the head to the new start of the reversed list
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;// remove first
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;// connecting step and removing desired element
        return;
    }

    // check palindrome
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is my midNode
    }

    // check if a given LinkedList is palndrome or not?
    public boolean checkPalindrome() {
        if (head == null/* empty node */ || head.next == null/* only one element */) {
            return true;
        }
        // to find the middle
        Node midNode = findMid(head);

        // step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;// start from midnode not from head like prev code
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;
        // step 3 check left half == right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null || fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true;// cycle
            }
        }
        return false;// cycle does not exist
    }

    public static void main(String args[]) { // and we use methods to add(),delete...etc.

        cycleLL linkedList = new cycleLL();
        linkedList.head = linkedList.new Node(1);
        linkedList.head.next = linkedList.new Node(2);
        linkedList.head.next.next = linkedList.new Node(3);

        // Create a cycle in the linked list
        linkedList.head.next.next = linkedList.head;

        System.out.println("Does the linked list have a cycle? " + isCycle());

    }
}
