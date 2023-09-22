public class subset{
public static void printSubarrays(int numbers[]) {
        // subarrays means continous part of array



        for (int i = 0; i < numbers.length; i++)// start
        {

            for (int j = i; j < numbers.length; j++)// end
            {


                for (int k = i; k <= j; k++)// start to end

                {

                    System.out.print(numbers[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
}
public static void main(String args[]){
int nun[]={1,2,3,4,5,6,7,8};
printSubarrays(nun);
}
}