package questionARRAY;//brute force approach

public class prob2 {
    public static void main(String args[]) {
int arr[]={7, 6, 4, 3, 10};
System.out.println(profit(arr));
    }

    public static int profit(int arr[]) {
        int sellmax = Integer.MIN_VALUE;
        int buymin = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        int curr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                buymin = arr[i];
                sellmax = arr[j];
                curr = sellmax - buymin;
                if (curr > maxprofit) {
                    maxprofit = curr;
                }
              

            }
        }
        if(maxprofit<0){
            return 0;
        }
        else{
            return maxprofit;
        }
    }
}