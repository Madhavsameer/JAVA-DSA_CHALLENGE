import java.util.*;
public class QueueLearn {
    public static void main(String[] args) {

        //Queue is a linear data structure that follows FIFO principle for doing operations whereas,
        //Priority queue works in a simple way but it follows ascending order

        
        // Queue <Integer> myQueue= new PriorityQueue<>(Collections.reverseOrder());//Priority ques in reverse 
       Queue <Integer> myQueue= new LinkedList<>();  //Normal queue using linkedlist because Queue is a constructor
        System.out.println(myQueue);
        myQueue.offer(9); //Add elemnent at tail
        myQueue.offer(12);
        myQueue.offer(7);
        myQueue.offer(5);
        myQueue.offer(4);
        System.out.println(myQueue); //print the ques
        System.out.println(myQueue.peek()); //returns the head element
        myQueue.poll(); //removes the head element
        System.out.println(myQueue);
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }



    }
}
