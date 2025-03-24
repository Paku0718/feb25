package Day16;


public class ThreadDemo10 extends Thread{
	
	
	
	synchronized void m1() {
		System.out.println(Thread.currentThread().getName()+" started-m1");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished-m1");
	}
	synchronized void m2() {
		System.out.println(Thread.currentThread().getName()+" started-m2");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished-m2");
	}
	
	public static void main(String[] args) {
		ThreadDemo10 d1 = new ThreadDemo10();
		ThreadDemo10 d2 = new ThreadDemo10();
		
		Thread t1 = new Thread() {
			public void run() {
				d1.m1();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				d1.m1();
			}
		};
		
		
		t2.start();
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		t1.start();
		
		
	}

}
