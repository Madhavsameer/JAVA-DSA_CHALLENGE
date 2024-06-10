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

        for(int i=0; i<arr.length; i++){
            for(int j=arr.length; j>0; j++){

                arr[i]==arr[j];

            }
        }
        
    }
}
