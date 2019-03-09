package hashtable;

public class storedEmployee {

	private String key;
	private Employee emp;
	
	public storedEmployee(String key, Employee emp) {
		super();
		this.key = key;
		this.emp = emp;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "storedEmployee [key=" + key + ", emp=" + emp + "]";
	}
	
	
}
