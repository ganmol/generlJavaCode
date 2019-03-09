package hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee a = new Employee("a", 1);
		Employee aa = new Employee("aa", 1);
		Employee aaa = new Employee("aaa", 1);
		Employee aaaa = new Employee("aaaa", 1);
		Employee aaaa1 = new Employee("abaa", 1);
		
		SimplehashTable hashtb = new SimplehashTable();
		hashtb.put("a", a);
		hashtb.put("aa", aa);
		hashtb.put("aaa", aaa);
		hashtb.put("aaaa", aaaa);
		hashtb.put("abaa", aaaa1);
		
		hashtb.printhashTable();
		
		System.out.println("retrieve  data for  key aaa"+hashtb.get("aaa"));
		System.out.println("retrieve  data for  key aaaa"+hashtb.get("aaaa"));
		System.out.println("retrieve  data for  key abaa"+hashtb.get("abaa"));
		
		
		System.out.println("Removing data for key : a "+hashtb.remove("a"));
		System.out.println("Removing data for key : aaa "+hashtb.remove("aaa"));
	}

}
