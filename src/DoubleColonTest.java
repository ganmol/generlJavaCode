
public class DoubleColonTest {
	//Constructor
	public DoubleColonTest(String in)
	  {
	    System.out.println(" constructor  " + in);
	  }
  //Functional Interface
  interface MyInterface{
      public void interfaceMethod(String input);
  }
  
  public static void staticmethod(String input)
  {
    System.out.println(" static mymethod  " + input);
  }
  
  public void method1(String input)
  {
    System.out.println(" mymethod  " + input);
  }
  
  public static void main(String[] args) {
    DoubleColonTest obj = new DoubleColonTest("a");
    // providing implementation for Interface interfacemethod with method1
    MyInterface dd = obj::method1;
    dd.interfaceMethod(" test string ");
    MyInterface second = DoubleColonTest::staticmethod;
    second.interfaceMethod(" test static string ");
    second.interfaceMethod("aaaaa");
    //Calling constructor
    MyInterface third= DoubleColonTest::new;
    third.interfaceMethod("saaa");  
    
  }

}