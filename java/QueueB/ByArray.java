package QueueB;

public class ByArray {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {//O(1)
            if (rear == size - 1) {
                System.out.println("queue is full");
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {//O(n) tbhi hm use ni krte array ko bcoz it should use O(1)
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {// for front only
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        // 1 2 3
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }
    }

}
