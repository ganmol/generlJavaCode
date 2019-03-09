package DoublyLinkedList;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	

	public void addToFront(Employee emptoBeadded){
		EmployeeNode empNode = new EmployeeNode(emptoBeadded);
		empNode.setNext(head);
		if (head==null){
			tail=empNode;}
		else
		{head.setPrevious(empNode);}
		head=empNode;
		size++;
		
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void PrintList(){
		EmployeeNode current = head;
		while (current!=null){
			System.out.println(current);
			System.out.println("_->  ");
			current=current.getNext();
		}
	}
	
	public EmployeeNode removeFromFront(){
		if(isEmpty()==true)
			return null;
		EmployeeNode tobeRemoved = head;
		head= head.getNext();
		return tobeRemoved;
		
	}
}
