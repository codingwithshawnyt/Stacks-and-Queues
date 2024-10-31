import java.util.*;
///////////////////////////////////////////////////////////////////////////
//
//    		Write a program that implements a Queue data structure.
//          Given an initial myQueue, create two new queues, 
//          oddQueue and evenQueue, so that oddQueue contains the odd
//          elements of myQueue and evenQueue contains the even elements.
//
//  e.g.
//      as in dealing a deck of cards
//
//  e.g.
//      myQueue   -->   43 92 41 39 10 32 62 17 29 51 35 44 24 15 73 66
//
//      oddQueue  -->   43 41 39 17 29 51 35 15 73
//      evenQueue -->   92 10 32 62 44 24 66
//      
//
///////////////////////////////////////////////////////////////////////////


public class Queue1{
	public static void main(String args[]) {
		Queue<Integer> myQueue = new LinkedList<>();
		myQueue.add(43);
		myQueue.add(92);
		myQueue.add(41);
		myQueue.add(39);
		myQueue.add(10);
		myQueue.add(32);
		myQueue.add(62);
		myQueue.add(17);
		myQueue.add(29);
		myQueue.add(51);
		myQueue.add(35);
		myQueue.add(44);
		myQueue.add(24);
		myQueue.add(15);
		myQueue.add(73);
		myQueue.add(66);
		oddEven(myQueue);
	}
	
	public static void oddEven(Queue<Integer> myQueue)
	{
		Queue<Integer> oddQueue = new LinkedList<>();
		Queue<Integer> evenQueue = new LinkedList<>();
		while(!myQueue.isEmpty())
		{
			if(myQueue.peek() % 2 != 0)
			{
				oddQueue.offer(myQueue.poll());
			}
			else
			{
				evenQueue.offer(myQueue.poll());
			}
		}
		System.out.println("Odd Queue: " + oddQueue);
		System.out.println("Even Queue: " + evenQueue);
	}
}