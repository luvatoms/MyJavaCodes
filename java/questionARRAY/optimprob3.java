package questionARRAY;

public class optimprob3 {
    public static void main(String args[]){

    }
    public static int maxprofit(int arr[])
    
{
    int buy = arr[0];
    int profit = 0;
    for(int i=0;i<arr.length;i++){
        if(buy<arr[i]){
            profit = Math.max(arr[i]-buy,profit);
        }else{
            buy=arr[i];

        }
    }
    return profit;
}
}
