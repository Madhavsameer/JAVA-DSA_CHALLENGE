package SELF_Practice;

public class ArraySum {
    
    public static void main(String[] args) {
        
        int myArr[]= {10,15,17,12};
        ArraySum(myArr);
    }

    public static void ArraySum(int arr[]){
        int sum=0;
            for (int i : arr) {
                sum+=i;
            }
            System.out.println("The sum of the given array is "+sum);
        }

    }

