public class fibonacciREC {
    public static void main(String args[]) {
System.out.println(fib(41));
    }

    public static int fib(int n) {
        if (n == 0|| n==1) {
            return n;
        }
        int m = fib(n - 1) + fib(n - 2);
         
        return m;
    }
}