package Day16;

class Sync extends Thread{
	synchronized void m1() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
	synchronized void m2() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
	void m3() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
	synchronized static void m4() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
	synchronized static void m5() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
	static void m6() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}


public class ThreadDemo9 {

	public static void main(String[] args) {
		Sync s1 = new Sync();
		Sync s2 = new Sync();
		Thread t1 = new Thread() {
			public void run() {
				s1.m1();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				s2.m1();
			}
		};
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		t2.start();
		
	}

}
