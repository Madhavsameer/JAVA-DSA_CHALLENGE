package SELF_Practice;

public class LinearSearch {
    public static void main(String[] args) {
        int myArr[]= {10,15,12,17,22,11};
       
        LinearSearch(myArr, 15);
}
public static void LinearSearch(int arr[], int target){
    for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
            System.out.println("Your target "+target+" is found at index "+i);
            return;
        } 
    }
    System.out.println("Element not found in the given array"); 
}
        
}
   
