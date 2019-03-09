
 interface Defult_method_Interface {

}
interface Left{
 default void m1(){
		System.out.println("Left method");
	}
}
interface Right{
	 default void m1(){
		System.out.println("Right method");
	}
}
class Test implements Left , Right{
	
	public void m1(){
		// make method public and overide m1 method by your own implementation
		//System.out.println("My own impl");
		//to call parent method use super
		 Left.super.m1();
	}
	public static void main(String[] args){
		Test11 t = new Test11();
		t.m1();
	}
}