package linkedStack;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a =new Employee("a", 1);
		Employee b =new Employee("b", 2);
		Employee c =new Employee("c", 3);
		Employee d =new Employee("d", 4);
		Employee e =new Employee("e", 5);
		Employee f =new Employee("f", 6);
		
		LinkedStack stack = new LinkedStack();
		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.push(d);
		
		System.out.println(stack.peek());
		
		//stack.printStack();
	}

}
