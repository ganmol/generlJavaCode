package multithreading;


class Thd1 extends Thread {
	
	//boolean is_inserted = false;
	//volatile
	private  volatile boolean  is_inserted = false;
	
	public void run() {
		for (int i =0 ; i<= 5 ; i++){
			System.out.println("Runner 1 : "+i);
		}
	}

	public boolean isIs_inserted() {
		return is_inserted;
	}

	public void setIs_inserted(boolean is_inserted) {
		this.is_inserted = is_inserted;
	}
	
}

public class Volatile_Keyword {

	public static void main(String[] args) {
		

		Thd1 th1=  new Thd1();
		
		
		th1.setIs_inserted(true);
		th1.start();

	}

}
