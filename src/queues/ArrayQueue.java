package queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

	
	private Employee[] queue;
	//front field never changes only back increments when items are added
	private int front;
	//back points to next availabe 
	private int back;
	
	public ArrayQueue(int capacity){
		queue = new Employee[capacity];
	}
	
	public void add(Employee emp){
		if(back==queue.length){
			Employee[] newQueue= new Employee[2*queue.length];
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue= newQueue;
		}
		queue[back]=emp;
		back++;
	}
	
	public int getsize(){
		return back-front;
	}
	
	public void remove(){
		if(getsize()==0)
			throw new NoSuchElementException();
	
		Employee emptoberomove = queue[front];
		queue[front]=null;
		front++;
		
		if(getsize()==0)
		{
			front=0;
			back=0;
		}
}
	
	public Employee peek(){
		if(getsize()==0)
			throw new NoSuchElementException();
		Employee emptoberomove = queue[front];
		return emptoberomove;
	}
	
	public void printQueue() {
		for(int i= front ;i<back  ;i++)
			System.out.println(queue[i]);
	}
}
