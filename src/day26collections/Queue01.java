package day26collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

        /*
            1)Queues use First In First Out(FIFO) rule
            2)Deque stands for Double Ended Queue it uses FIFO and LIFO(Last In First Out)
         */

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.add("Tom");
        que.add("Ajda");
        que.add("Brad");
        que.add("Jim");
        System.out.println(que);// [Tom, Ajda, Brad, Jim] ==> Elements are in "insertion order" because I used LinkedList as constructor

        Queue<String> myQue = new PriorityQueue<>();
        myQue.add("Tom");
        myQue.add("Ajda");
        myQue.add("Brad");
        myQue.add("Jim");
        System.out.println(myQue);// [Ajda, Jim, Brad, Tom] ==> Elements are in an "order" according to the Java logic
                                  // because I used PriorityQueue as constructor.

        Deque<String> dq = new LinkedList<>();
        dq.add("Tom");
        dq.add("Ajda");
        dq.add("Brad");
        dq.add("Jim");

        System.out.println(dq);// [Tom, Ajda, Brad, Jim]
                               //If you look at the Deque methods, you will notice the methods are in ...first() and ...last()
                               //The methods are focusing first and the last elements.
    }
}