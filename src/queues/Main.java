package queues;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a =new Employee("a", 1);
		Employee b =new Employee("b", 2);
		Employee c =new Employee("c", 3);
		Employee d =new Employee("d", 4);
		Employee e =new Employee("e", 5);
		Employee f =new Employee("f", 6);
		
		ArrayQueue queue = new ArrayQueue(5);
		queue.add(a);
		queue.add(b);
		queue.add(c);
		queue.add(d);
		queue.peek();
		
		queue.printQueue();
		
		System.out.println(queue.getsize());
		queue.remove();
		System.out.println(queue.getsize());
		
		
	}

}
