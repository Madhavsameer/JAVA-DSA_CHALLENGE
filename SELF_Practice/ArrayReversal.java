package SELF_Practice;

public class ArrayReversal {
    public static void main(String[] args) {
        int myArr[]={5,7,8,9,3,2};
        ArrayReversal(myArr);
    }

    public static void ArrayReversal(int arr[]){
        // int n=arr.length;
        // for(int i=0; i<n/2; i++){
        //     int temp=arr[i];
        //     arr[i] = arr[n - 1 - i];
        //     arr[n - 1 - i] = temp;
        // }

        // for(int i: arr){
        //     System.out.println(i);
        // }
        int i=0;
        int n=arr.length-1;
        while(i<n){
            int temp=arr[i];
            arr[i]= arr[n];
            arr[n]=temp;;
            i++;
            n--;
        }
        for (int j : arr) {
            System.out.println(j);
        }
        
        

    
        
    }
}
