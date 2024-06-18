package Revision;

import java.util.Scanner;

public class ScannerPrac {
    public static void main(String[] args) {

        System.out.println("Hello world ");
        
        String name;
        int age;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=s.next();
        System.out.println("Enter your age: ");
        age=s.nextInt();

        System.out.println("Hey user your name is "+ name+" and your age is "+age);


    }
}
