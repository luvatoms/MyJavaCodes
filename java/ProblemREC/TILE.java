package ProblemREC;

/*given a 2*n board nd tiles of size 2*1 count the number of ways to tile 
the given board using the 2*1 tiles a tile can either be horiz. or verti.*/
public class TILE {
    public static void main(String args[]) {
        System.out.println(tilep(4));
    }

    public static int tilep(int n) {
        if (n == 0 || n == 1) {
            return 1;// base case
        }
        // int fnm1 = tilep(n-1);//verical choice
        // int fnm2 = tilep(n-2);//horizontal choice
        // int totalways = fnm1 + fnm2;
        return tilep(n - 1) + tilep(n - 2);

    }
}