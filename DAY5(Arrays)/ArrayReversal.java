
public class ArrayReversal {

    public static void main(String[] args) {
        int myArr[]={5,2,8,6,3,7};
        reverseArray(myArr);
        
    }

    public static void reverseArray(int arr[]){

        System.out.println("Your array before reversal is");
       for(int i:arr){
        System.out.print(i+" ");
       }

        int start=0;

        int end=arr.length-1;
        

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        System.out.println("\n your array after reversal is");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
