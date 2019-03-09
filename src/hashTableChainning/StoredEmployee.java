package hashTableChainning;

public class StoredEmployee {

	private Employee emp;
	private String key;

	
	
	public StoredEmployee( String key ,Employee emp) {
		super();
		this.emp = emp;
		this.key = key;
	}
	Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
