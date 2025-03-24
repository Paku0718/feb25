package Day16;
//using runnable interface method 2
class MyRun1 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i+ " : "+ Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("Lambda expression are working");
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
