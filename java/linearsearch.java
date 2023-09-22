
public class linearsearch {
    public static int ls(int numbers[],int key ){
        for(int i = 0 ; i < numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]= {1,2,3,4,5,6,7,8,9,10};
        int key = 10 ;
        System.out.println(ls(numbers,key));

    }

}
