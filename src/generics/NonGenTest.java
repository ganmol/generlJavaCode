package generics;

class NonGen{
	Object obj;

	public NonGen(Object ob) {
		obj = ob;
	}

	public Object getObj() {
		return obj;
	}
	
	void showType(){
		System.out.println(obj.getClass().getName());
	}
}

public class NonGenTest {

	public static void main(String[] args) {
		NonGen i = new NonGen(10);
		NonGen str = new  NonGen("test");
		
		i.showType();
		str.showType();
		
		i=str;
		//Integer v = (Integer) i.getObj(); 
		String istr = (String) i.getObj(); 
		System.out.println(istr);

	}

}
