package demo;

public class ThreadReverse {

	public static void main(String[] args) {
	try {
		Thread demoThread= Thread.currentThread();
		System.out.println("demoThread");
		demoThread.setName("Reverse Thread");
		System.out.println(demoThread);
		for(int i=100; i>=1; i-- ) {
			System.out.println(i);
			Thread.sleep(6000);
		}
	} catch(InterruptedException e) {
		throw new RuntimeException(e);
	}

	}

}
