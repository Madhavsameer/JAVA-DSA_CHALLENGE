public class looping {
    public static void main(String[] args) {

        // For loop
        for(int i=0; i<=5; i++){
            System.out.println(i);
        }
        
        //While loop
        int init=1;
        while(init<=10){
            System.out.println(init);
            init++;
        }

        //do-while loop
        int mynum=1;
        do{
            System.out.println(mynum);
            mynum++;
        }
        while(mynum<=15);


        
        int n=10;
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            
            i++;
        }
        System.out.println("Sum of given n natural numbers"+sum);
        int number=5;
        for(int j=1; j<=10; j++){

            
            System.out.println(number+"x"+j+"="+number*j);

        }

        //factorial
        int num=4;
        int result=1;

        if(num==1 || num==0){
            System.out.println("Factorial is "+result);
        }

        else{

        for(int k=num-1;k>=1; k--){
            result=num*=k;
        }
        System.out.println("Factorials of the given number is "+result);
    }


        
        

       
        
        

    }
    
    
}
