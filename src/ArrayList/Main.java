package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import SinglyLinkedList.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp_list = new ArrayList<>();

		emp_list.add(new Employee("a", 1));
		emp_list.add(new Employee("b", 2));
		emp_list.add(new Employee("c", 3));
		emp_list.add(new Employee("d", 4));
		emp_list.add(new Employee("e", 5));
		emp_list.add(new Employee("f", 6));
		emp_list.add(new Employee("g", 7));
		emp_list.add(new Employee("h", 8));
		emp_list.add(new Employee("i", 9));
		emp_list.add(new Employee("j", 10));
		
		emp_list.forEach(emp-> System.out.println(emp));
		
		emp_list.set(2, new Employee("aa", 11));
		emp_list.add(5, new Employee("aa", 11));
		emp_list.add(new Employee("aa", 11));
		System.out.println("after adding");
		emp_list.forEach(emp-> System.out.println(emp));
		
		System.out.println(emp_list.size());
		
		Object[] emp_array= emp_list.toArray(new Employee[(emp_list.size())]);
		for (Object emp : emp_array)
			System.out.println(emp);
		
		System.out.println(emp_list.contains(new Employee("c", 3)));
		
//###################### Vector  #####################
	
	List<Employee> emp_vector = new Vector<>();

emp_vector.add(new Employee("a", 1));
emp_vector.add(new Employee("b", 2));
emp_vector.add(new Employee("c", 3));
emp_vector.add(new Employee("d", 4));

	}

}
