import java.util.Scanner;

public class inputOutput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b= sc.nextInt();
        int r;

        System.out.println("Choose the operation you want to perform ");
        System.out.println("1. Sum  2. Differnce");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            r=a+b;
            System.out.println("Your sum is "+r);
                break;
            case 2:
            r=a-b;
            System.out.println("Your differnce is "+r);
            break;

            default:
                break;
                
        }
    }
    
}
