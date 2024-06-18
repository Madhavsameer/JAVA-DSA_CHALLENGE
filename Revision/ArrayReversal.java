package Revision;

/**
 * hey2
 */
public class ArrayReversal {

    public static void main(String[] args) {
        int myArr[]={5,7,9,2,1};

        
        
        reverseArray(myArr);
        


    }

    public static void reverseArray(int arr[]){

        System.out.println("Your array before reversal is");
        for (int i : arr) {
            System.out.print(i+"\t");
            
        }
        System.out.println();
        
        int start = 0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        System.out.println("Your array after reversal is");
        for (int i : arr) {
            System.out.print(+i +"\t");
        }
    }
}