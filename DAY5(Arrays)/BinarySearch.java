import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int myArr[]={1,2,3,4,5,6,7,8};
        
        BinarySearch(myArr, 9);

    }

    public static void BinarySearch(int arr[], int target){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("Target element found");
                return;
            }
           else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Target element not found");
        
    }
}
