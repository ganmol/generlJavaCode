 class Parent1{
	 static
	
	 public void m1(){
		 System.out.println("parent");
	 }
	
}
 class Child1 extends Parent1{
		
	 public void m1(){
		 System.out.println("child");
	 }
	
}
public class Test11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p = new Child1();
		p.m1();
	}

}
