package DoublyLinkedList;


import SinglyLinkedList.EmployeeLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee a= new Employee("a", 1);
		Employee b =new Employee("b", 2);
		Employee c =new Employee("c", 3);
		Employee d =new Employee("d", 4);
		Employee e =new Employee("e", 5);
		Employee f =new Employee("f", 6);
		
		EmployeeDoublyLinkedList emp_doublelinkedlist = new EmployeeDoublyLinkedList();
		emp_doublelinkedlist.addToFront(d);
		emp_doublelinkedlist.addToFront(b);
		emp_doublelinkedlist.addToFront(b);
		emp_doublelinkedlist.addToFront(c);
		
		emp_doublelinkedlist.PrintList();
		System.out.println(emp_doublelinkedlist.getSize());
		
		System.out.println("after removing ");
		
		System.out.println(" element removed is " +emp_doublelinkedlist.removeFromFront());
		
		emp_doublelinkedlist.PrintList();
		System.out.println(emp_doublelinkedlist.getSize());
	}

}
