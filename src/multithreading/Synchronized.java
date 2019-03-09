package multithreading;


public class Synchronized {
	private static int count=0;
	public static void main(String[] args) {
		compute();
		
	}

	private static void compute() {
	Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0 ; i<=100 ;i++){
					count++;
				}
				
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0 ; i<=100 ;i++){
					count++;
				}
				
			}
		});
		t1.run();
		t2.run();
		
		System.out.println(count);
	}

}
