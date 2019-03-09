package SinglyLinkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a =new Employee("a", 1);
		Employee b =new Employee("b", 2);
		Employee c =new Employee("c", 3);
		Employee d =new Employee("d", 4);
		Employee e =new Employee("e", 5);
		Employee f =new Employee("f", 6);
		
		EmployeeLinkedList emp_linkedlist = new EmployeeLinkedList();
		emp_linkedlist.addToFront(a);
		emp_linkedlist.addToFront(b);
		emp_linkedlist.addToFront(b);
		emp_linkedlist.addToFront(c);
		
		
		emp_linkedlist.PrintLn();
		System.out.println(emp_linkedlist.getSize());
		
		System.out.println("after removing ");
		
		System.out.println(" element removed is " +emp_linkedlist.removeFromfront());
		
		emp_linkedlist.PrintLn();
		System.out.println(emp_linkedlist.getSize());
		
		
		
	}

}
