public class Constructor {

    public static void main(String[] args) {

    
        Constructor c= new Constructor();
        Constructor c1= new Constructor(5, "Radhika");
        
    }

    //Default Constructor
   public Constructor(){
    int age=97;
    String name="Sameer";
    System.out.println(name+" "+age);

    }

    //parameterized constructor
    public Constructor(int favnum, String gfname){
        System.out.println("My fav num is"+favnum+"My gf name is "+gfname);

    }



    }
    

