// /*Question1:ForagivenintegerarrayofsizeN.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.Usearecursivefunctiontosolvethisproblem.Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample Output: 1 5 7 8 */
package ProblemREC;
public class question1 {
    public static void main(String args[]) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        int res[]=new int[arr.length];
        find(0, 0,2, arr,res,0);
    }

    public static void find(int i,int j, int key, int arr[],int res[],int count) {

        if (i == arr.length) {
            print(res,count);
            return;
        }
        else if (arr[i] == key) {
            res[j] = i;

            count++;
            find(i+1, j+1, key, arr, res, count);
        }
        else{
            find(i+1, j, key, arr, res, count);
        }
    }

    public static void print(int arr[],int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}