package generics;

class TwoGen<T,V>{
	T tobj;
	V vobj;
	public T getTobj() {
		return tobj;
	}
	public V getVobj() {
		return vobj;
	}
	public TwoGen(T tobj, V vobj) {
		this.tobj = tobj;
		this.vobj = vobj;
	}
	
	void showType(){
		System.out.println(tobj.getClass().getName());
		System.out.println(vobj.getClass().getName());
	}
	
	
}
public class TwoGenTest {

	public static void main(String[] args) {
		TwoGen<Integer , String > int_str = new TwoGen(69, "vvv");
		
		int_str.showType();

	}

}
