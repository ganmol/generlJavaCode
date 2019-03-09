class Outer {
	int outer_var=10;
	static int static_outer_var=100;
	public void outer_methods(){
		System.out.print(" non -static method of outer class");
}
	public static void static_outer_method(){
		System.out.print("static  outer method of Outer Class");
	}

	public static void test(){
	Inner inr = new Inner();
	Outer.static_outer_method(); 
	inr.inner_methods();  
	Inner.inner_methods(); // Inner class accessing static method
	/*inr.outer_methods(); // inner obj cannot access non-sataic method of Outer Class
	inr.outer_var;   // inner obj cannot access non-static var of Outer Class
	inr.static_outer_var; // inner obj cannot access static var of Outer Class
	*/
}

	static class Inner{
		public static void inner_methods(){
		System.out.print( "non -static method of inner class");
}

}
}

public class NestedClass {

	public static void main(String[] args) {
		
Outer ot = new Outer();
ot.test();

	}

}
