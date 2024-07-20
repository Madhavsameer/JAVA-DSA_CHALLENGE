package SELF_Practice;

public class FindLargest {

    

    public static void main(String[] args) {
        int arr[]={2,1,8,6,5,7,3,9,4};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest number in the given array is "+largest);
        System.out.println("Smallest element in the given array is "+smallest);
        

    }
}
