package RECURSION;

public class printnumbers {

    public static void main(String[] args) {
        numberprint(1,10);
        

    }

    public static void numberprint(int i, int n){
        if(i>n)return;
        System.out.println(i);
        numberprint(i+1,n);
        
        
    }
    
}
