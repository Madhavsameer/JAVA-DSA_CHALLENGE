class Animal {

    void eat(){
        System.out.println("Animals do eat food");
    }
    // Inheritence means inherit the properties of parent class by child class
    public static void main(String[] args) {
        Dog tommy= new Dog();
        tommy.eat();
        tommy.sleep();
    }
}

class Dog extends Animal{

    void sleep(){
        System.out.println("I can sleep ");
    }



    
}
