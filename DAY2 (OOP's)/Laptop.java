public class Laptop {

    void brand(){
        System.out.println("I have brand");
    }


    //Polymorphism means many forms same object can behave differently based upon class
    public static void main(String[] args) {
    
        Laptop lp;
        lp=new Hp();
        lp.brand();
        lp=new Dell();
        lp.brand();
        
        
    }
}

class Hp extends Laptop{
    void brand(){
        System.out.println("My brand is HP");
    }


}

class Dell extends Laptop{
    void brand(){
        System.out.println("My brand is Dell");
    }


}
