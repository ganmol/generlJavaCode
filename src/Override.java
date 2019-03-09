class A{
	public void display(){
		System.out.println("Parent method");
	}
}
class B extends A{
	public void display(){
		System.out.println("child method");
	}
}
public class Override {

	public static void main(String[] args) {
		A a = new A();
		a.display();

	}
}
