import java.util.*;
public class StackLearn {
public static void main(String[] args) {

    //Stack is a linear data structure that follows LIFO principle for doing operations
    
    Stack <Integer> myStack= new Stack<>();
    System.out.println(myStack);//empty stack
    myStack.push(5);//push elemennt to top
    myStack.push(7);
    myStack.push(3);
    
    System.out.println(myStack.isEmpty());//checks if stack is empty
    
    System.out.println(myStack);
    System.out.println(myStack.pop());//removes the top element
    System.out.println(myStack.peek());//returns the top element
}
    
}