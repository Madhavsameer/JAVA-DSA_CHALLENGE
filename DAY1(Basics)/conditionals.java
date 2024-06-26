public class conditionals {

    public static void main(String[] args) {
        
        int age=15;
        if(age<=5){
            System.out.println("you are an infant");
        }
        else if(age>5 && age<=15){
            System.out.println("You are child");
        }
        else if(age >50){
            System.out.println("You are an Old person");
        }
        else{
            System.out.println("You are an adult ");
        }
    }
    
}
