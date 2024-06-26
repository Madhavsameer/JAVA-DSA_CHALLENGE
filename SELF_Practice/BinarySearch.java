package SELF_Practice;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

    int myArr[]= {10,15,12,17,22,11};
    Arrays.sort(myArr);
    BinarySearch(myArr, 11);
    
    }

    public static void BinarySearch(int arr[], int target){
        int i=0;
        int j=arr.length;
        while(i<j){
            int mid=(i+j)/2;

            if(arr[mid]==target){
                System.out.println("Your target  "+target +" is found at index "+mid);
                return;
            }
            else if(arr[mid]<target){
                i=mid+1;
            }

            else{
                j=mid-1;
            }
        }

        System.out.println("You target is not found in the given array");

    }

    
}
