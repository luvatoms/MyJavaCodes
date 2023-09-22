public class RecurNToOne {
    public static void main(String args[]) {
        System.out.println(prindec(10));
    }

    public static int prindec(int n) {
        if (n == 1) {
            return 1;
        }
        int m = n - printdec(n - 1);
return m;
    }
}
