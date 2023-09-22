//showing error in compilation to find it just solve it in paper pen
public class subarray {
    public static void printSubarrays(int numbers[]) {
        // subarrays means continous part of array

        int maxsub = Integer.MIN_VALUE;
        int minsub = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++)// start
        {

            for (int j = i; j < numbers.length; j++)// end
            {
                int sum = 0;

                for (int k = i; k <= j; k++)// start to end

                {

                    System.out.print(numbers[k]);

                    sum = numbers[k] + sum;

                }
                System.out.println(" ");
                System.out.println(sum);
                if (maxsub < sum) {
                    maxsub = sum;
                }
                if (minsub > sum) {
                    minsub = sum;
                }

            }

            System.out.println(" ");
        }

        System.out.println("max sum of subset " + maxsub);// final value chahiye thi isliye loop ke bhar likha
        System.out.println("  min sum of subset " + minsub);

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}
