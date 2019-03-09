
class Parent_general {
	
	int val=-10;
	
	void display(){
		System.out.println("parent class");
	}
}

class Child_general extends Parent_general {
	int val=-5;
	
	void display(){
		System.out.println("child class");
	}
}

class General {
 
	public void m1(Parent_general pg){
		System.out.println("Parent_ general  version ");
	}
	
	public void m1(Child_general cg){
		System.out.println("Child_general  version ");
	}
	
	
	public static void main(String[] args) {
		/* Runtime Error :
		 * Exception in thread "main" java.lang.ClassCastException: Parent_general cannot be cast to Child_general
		at General.main(General.java:22)
			 
			 DownCasting
		Child_general cg = (Child_general)new Parent_general();
		Parent_general cg = (Child_general)new Parent_general();
		*/
		Parent_general cg = new Child_general();
		System.out.println("val : "+ cg.val);
		System.out.println("Incase of overidding of display method : ");
		cg.display();
		General  g =  new General();
		System.out.println("Incase of overloading : ");
		g.m1(cg);
		
	}

}
