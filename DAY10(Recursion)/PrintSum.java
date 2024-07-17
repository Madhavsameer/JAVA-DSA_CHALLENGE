package RECURSION;

public class PrintSum {
    public static void main(String[] args) {
        System.out.println(sumNatural(1, 10, 0));
        
    }

    public static int sumNatural( int i,int n, int sum){

        if(i>n) return sum;
        sum+=i;
        return sumNatural(i+1, n, sum);
        
    }
}
