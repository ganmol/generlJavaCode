package DoublyLinkedList;

public class Employee {

	private String name;
	private int id;
	
	
	
	
	public Employee(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
