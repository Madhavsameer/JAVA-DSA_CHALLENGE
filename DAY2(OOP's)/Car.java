
public class Car {


    //Encapsulation means wrapping up of data members and member function in a seperate class
    //Privately to secure the data
    public static void main(String[] args) {

        Car cr= new Car();
        cr.carInfo();
        cr.setprice(15000);
        System.out.println(cr.getprice());
        cr.carPrice();
        
        
        
    }

    private int Price=12500;
    private String Name="Toyota";
    private String Color="Red";

    int getprice(){
        return Price;
    }

    void setprice(int Price){
        this.Price=Price;
    }

    public int carPrice(){
        System.out.println("The price of the Car is "+Price);

        return 1;

    }

    public void carInfo(){
        System.out.println("My name is "+Name+" My price is "+Price+" My color is "+Color);
    }

   



    

    
}
