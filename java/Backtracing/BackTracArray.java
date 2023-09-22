package Backtracing;

public class BackTracArray {
    public static void main(String args[]){
     int arr[] = new int[5];
     changeArr(arr,0,1);
     printArr(arr);

    }
    public static void changeArr(int arr[]  ,int i ,int val ){
        //base case
        if(i ==arr.length){
            printArr(arr);
            return;

        }

        //recurssion or kaam
        arr[i] = val;
        changeArr(arr, i +1,val + 1);
        //jb stack se value return kregi toh ye value execute hogi
        //qki ye functionn ke baad likhi hui hai isliye fn vaaps aate
        //wqt isko execute krega
        arr[i]=arr[i]-2;
    }
   public static void printArr(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
