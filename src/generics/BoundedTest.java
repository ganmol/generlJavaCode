package generics;

class Gen<T>{
	T[] nums;
	
	public Gen(T[] num) {
		nums = num;
	}

	public T[] getNums() {
		return nums;
	}

	double average(){
		double sum = 0.0;
		 for(int i=0; i < nums.length; i++)
		 sum += ((Object) nums[i]).doubleValue(); // Error!!!
		return sum/nums.length;
	}
}
public class BoundedTest {

	public static void main(String[] args) {
		Integer inums[] = { 1, 2, 3, 4, 5 };
		 Gen<Integer> iob = new Gen<Integer>(inums);
		 double v = iob.average();
		 System.out.println("iob average is " + v);
	}

}
