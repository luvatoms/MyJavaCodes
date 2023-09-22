package Backtracing;

public class GridwaysProb {

    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        System.out.println(FindWays(0, 0, n, m));

    }

    public static int FindWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {// conditn for last cell
            return 1;
        } else if (i == n || j == m) {// boundary cross conditn
            return 0;
        }
        // kaam or recuusive fn
        return FindWays(i, j + 1, n, m) + FindWays(i + 1, j, n, m);
    }

}
 