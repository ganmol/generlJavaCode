package linkedStack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {

	private LinkedList<Employee> stack ;

	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee emp){
		stack.push(emp);
	}
	
	public Employee pop(){
		return stack.pop();
	}
	
	public Employee peek(){
		return stack.peek();
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public void printStack(){
		Iterator<Employee> stack_itr = stack.iterator();
		while(stack_itr.hasNext()){
			System.out.println(stack_itr.next());
		}
		
	}
}
