public class trappingrainwater {
    public static int trw(int height[]) {
        int trappedwater = 0; // initialize trappedwater to 0
        int n = height.length;
        // left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0]; // set leftmax[0] to height[0]
        for (int i = 1; i < n; i++) { // start loop from 1 instead of 0
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1]; // set rightmax[n-1] to height[n-1]
        for (int i = n - 2; i >= 0; i--) { // end loop at 0 instead of -1
            rightmax[i] = Math.max(height[i], rightmax[i + 1]); // use Math.max instead of Math.mifn
        }

        // water level
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]); // declare waterlevel inside loop
            // volume of water
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
    }

    public static void main(String args[]) {
        int h[] = { 4, 2, 0, 6, 3, 2, 5, 6, 4, 3, 2, 2334, 35, 545, 565, 656 };
        System.out.print(trw(h));
    }
}
