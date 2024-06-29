import java.util.Scanner;

public class ArraySum {


    public static void main(String[] args) {
        sumOfArray();
        
        

    }

    public static void sumOfArray(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int myArr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n;i++){
            myArr[i]=sc.nextInt();
        }
        System.out.println("Your array is");
        for(int i:myArr){
            System.out.print(i+" ");
        }
        System.out.println();

        int sum=0;
        for(int i =0; i<n; i++){
            sum+=myArr[i];
        }
        System.out.println("The sum of the given array is "+sum);
    }

    
    
}
