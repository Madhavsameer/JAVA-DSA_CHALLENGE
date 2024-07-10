public class FindLargest {
    public static void main(String[] args) {
        int myArr[]={7, 15, 8, 3, 11, 9, 4};
        FindLargest(myArr);
    }

    public static int FindLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){

            if(arr[i]>=largest){
                largest=arr[i];
            }

        }


        return largest;
    }
}
