/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int myArr[]={14,5,7,8,3,12,5};
        linearSearching(myArr, 2);
        
    }

    public static boolean linearSearching(int arr[], int target){
        for(int i:arr){
            if(i==target){
                System.out.println("Element found");
                return true;
            }
        }
        System.out.println("Element not found");
        return false;
    }
}