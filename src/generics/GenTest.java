package generics;

class Gen<T>{
	
	T obj;

	public Gen(T ob) {
		obj = ob;
	}

	public T getObj() {
		return obj;
	}
	
	void showType(){
		System.out.println(obj.getClass().getName());
	}
	
	
}

public class GenTest {

	public static void main(String[] args) {
		Gen<Integer> i  = new Gen<Integer>(88);
		Gen<String> str = new Gen<String>("testString");
		
		System.out.println( i.getObj());
		i.showType();
		
		System.out.println( str.getObj());
		str.showType();
		
		//i=str;
	}

}
