package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterUsage {
	
	

	public static void main(String[] args) {
		String[] factors = {"A","N","M","N","L", "N","N","N","N","N",};
		ArrayList<String> arrLst = new ArrayList(Arrays.asList(factors));
		Stream str= arrLst.stream();
		System.out.println( str.filter(s-> s.equals("N")).getClass());
		List targetLst =(List) str.filter(s-> s.equals("N")).collect(Collectors.toList());
		int count = (int) str.filter(s-> s.equals("N")).count();
		
		//collect(Collectors.toList());
		System.out.println("Stream obj :"+str);
		System.out.println("Filtered List :" +targetLst);
}
}