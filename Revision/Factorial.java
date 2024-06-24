package Revision;

public class Factorial {

    public static void main(String[] args) {
        factorial(5);
        System.out.println("Factorials of the given number is "+factorial(5));
        
    }
    public static int factorial(int n){
        // int fact=1;
        // for(int i=n; i>=1; i--){
        //     fact*=i;
        // }
        // System.out.println("Factorial of the given number is "+fact);

        if (n==1 || n==0) return 1;
        else return n*factorial(n-1);
    }

    


    
    
}
