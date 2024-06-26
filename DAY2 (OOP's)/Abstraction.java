public class Abstraction  extends AbstractClass {


    //Abstraction means hiding the logic of code how it is implemented 
    //it is done by abstract class and interface

    public static void main(String[] args) {

        Abstraction abs= new Abstraction();
        abs.show();
        abs.work();
        abs.run();

        
        
    }
    void run() {
        System.out.println("i can run");
        
    }

   
    public void work() {

        System.out.println("I will show mmy work");
        
    }

   
    public void show() {

        System.out.println("Its just a show");
    
    }


    
    

    
    
}
