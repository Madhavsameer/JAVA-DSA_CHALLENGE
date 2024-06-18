package SELF_Practice;

public class Recursion {
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
        System.out.println(sum(10));
        
        
    }

    public static int factorial(int num){
        if(num==1 || num==0) return num;
        int fact=num*factorial(num-1);
        return fact;
    }

    public static int sum(int num){
        if(num==1) return 1;
        int result=num+sum(num-1);

        return result;

    }
}
