import java.io.IOException;
/*
class AirPlane{
	public AirPlane() throws Exception{
		System.out.println("AIRPlane");
		throw new IOException();
	}
}
class AirJet extends AirPlane{
	public AirJet() throws Exception{
		try{
		
		}catch ( Exception e){
		System.out.println("AIRPlane");
		throw new IOException();
		}
	}
	
}
public class Tester {

	public static void main(String[] args) {
		try{}catch (Exception e){
			System.out.println("tester");
		}
	}

}*/
class Superclass{
public void display(){
System.out.print("method of parent");
}
}
class Subclass extends Superclass {
//Overrides
public void display(){
	super.display();
System.out.print("method of child");
}
}
public class Tester{
public static void main(String []a){
Subclass sbcl = new Subclass();
sbcl.display();
}
}

