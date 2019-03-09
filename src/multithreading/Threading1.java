package multithreading;

/*class Runner1 implements Runnable{

	@Override
	public void run() {
		for (int i =0 ; i<= 5 ; i++){
			System.out.println("Runner 1 : "+i);
		}
	
	}
}

class Runner2 implements Runnable{

	@Override
	public void run() {
		for (int i =0 ; i<= 5 ; i++){
			System.out.println("Runner 1 : "+i);
		}
	}
	
}*/

class Thread1 extends Thread {
	public void run() {
		for (int i =0 ; i<= 5 ; i++){
			System.out.println("Runner 1 : "+i);
		}
	}
}
class Thread2 extends Thread {
	public void run() {
		for (int i =0 ; i<= 5 ; i++){
			System.out.println("Runner 1 : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}
public class Threading1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 th1=  new Thread1();
		Thread2 th2=  new Thread2();
		
		
		
		// th1 will join in to execute first
		th1.join();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		th1.run();
		th2.run();
		System.out.println("main thread invoked");
		
	/*	// Using Runable Intecface
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		t1.start();
		t2.start();*/
	}

}
