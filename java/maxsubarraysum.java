
//showing error in compilation to find it just solve it in paper pen 
import java.util.*;

public class maxsubarraysum {
    /* brute force method */
    // public static void printSubarrays(int numbers[]) {
    // // subarrays means continous part of array

    // int maxsub = Integer.MIN_VALUE;
    // int minsub = Integer.MAX_VALUE;

    // for (int i = 0; i < numbers.length; i++)// start
    // {

    // for (int j = i; j < numbers.length; j++)// end
    // {
    // int sum = 0;

    // for (int k = i; k <= j; k++)// start to end

    // {

    // System.out.print(numbers[k]);

    // sum = numbers[k] + sum;

    // }
    // System.out.println(" ");
    // System.out.println(sum);
    // if (maxsub < sum) {
    // maxsub = sum;
    // }
    // if (minsub > sum) {
    // minsub = sum;
    // }

    // }

    // System.out.println(" ");
    // }

    // System.out.println("max sum of subset " + maxsub);// final value chahiye thi
    // isliye loop ke bhar likha
    // System.out.println(" min sum of subset " + minsub);

    // }

    // prifix sum method
    public static void prefixsummethod(int numbers[]) {
        // subarrays means continous part of array
        int prefixarray[] = new int[numbers.length];
        for (int i = 1; i < numbers.length; i++) {
            prefixarray[0] = numbers[0];

            prefixarray[i] = prefixarray[i - 1] + numbers[i];
        }

        int maxsub = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++)// start
        {
            int sum;
            for (int j = i; j < numbers.length; j++)// end
            {

                sum = i == 0 ? prefixarray[j] : prefixarray[j] - prefixarray[i - 1];// ternary operator
                if (maxsub < sum) {
                    maxsub = sum;
                }

            }

            System.out.println(" ");
        }
        System.out.println("max sum of subset " + maxsub);// final value chahiye thi isliye loop ke bhar likha

    }

    public static void kadanmethod(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
            if (sum < 0) {
                sum = 0;
            }

            if (maxsum < sum) {
                maxsum = sum;
            }

        }
        System.out.println("maximum sum of subsets  is : " + maxsum);

    }

    public static void main(String args[]) {
        int numbers[] = { -2, 4, -6, 8, 10 };

        kadanmethod(numbers);
        prefixsummethod(numbers);
    }
}
