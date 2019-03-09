package DoublyLinkedList;

public class EmployeeNode {

	private EmployeeNode next;
	private Employee emp;
	private EmployeeNode previous;
	
	public EmployeeNode(Employee emp) {
		super();
		this.emp = emp;
	}
	public EmployeeNode getNext() {
		return next;
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public EmployeeNode getPrevious() {
		return previous;
	}
	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}
	@Override
	public String toString() {
		return "EmployeeNode [emp=" + emp + "]";
	}
	
	
	
	
}
