package SinglyLinkedList;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee empToBeAdded) {
		EmployeeNode empnode= new EmployeeNode(empToBeAdded);
		empnode.setNext(head);
		head = empnode;
		size++;
	}
	
	public EmployeeNode removeFromfront(){
		if(is_Empty()==true)
			return null;
		EmployeeNode toBeRemoved = head;
		head=head.getNext();
		size--;
		return toBeRemoved;
	}
	
	public int getSize(){
		return size;
	}
	
	public  void PrintLn(){
		EmployeeNode current = head;
		while(current!=null){
			System.out.println(current);
			System.out.println(" -> ");
			current=current.getNext();
		}
	}
	public boolean is_Empty(){
		return head==null;
	}
}
