import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	     Integer n = s.nextInt();
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     for (int i =0;i<=n ; i++){
	         list.add(s.nextInt());
	     }
	     ArrayList<Integer> templist = new ArrayList<Integer>();
	     templist=list;
	     Collections.sort(templist);
	     int min=templist.get(0)  , max=templist.get(n);
	    System.out.print(min);

	}

}
