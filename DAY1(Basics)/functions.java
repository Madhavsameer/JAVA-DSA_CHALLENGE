
public class functions {
    public static void main(String[] args) {
        factorial(5);
        sumOfNumbers(10);
        

    }
    //

    static void factorial(int number){
        int result=1;
        for(int i=number; i>1; i--){
           result*=i;
        }
        System.out.println(result);
    }

    static void sumOfNumbers(int number){
        int result=0;
        for(int i=1; i<=number; i++){
            result+=i;
        }
        System.out.println(result);

    }
}
