package multithreading;

public class Counter implements Runnable {

	@Override
	public synchronized void run() {
		Thread thread=Thread.currentThread();
		for(int i=1;i<=100;i++) {
			System.out.println("Counter:= "+i+" Name :" + thread.getName());
		}
		
	}

	
}
