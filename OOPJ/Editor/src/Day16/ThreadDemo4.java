package Day16;

class AddRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(i+ " : "+ Thread.currentThread().getName());
		int sum=0;
		for(int i=0; i<20; i++) {
			sum +=i;
		}
		System.out.println("sum = " + sum + Thread.currentThread().getName() + " Enden");
	}
}
class MulRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(i+ " : "+ Thread.currentThread().getName());
		int res=1;
		for(int i=0; i<20; i++) {
			res +=i;
		}
		System.out.println("sum = " + res + Thread.currentThread().getName() + " Enden");
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new AddRunnable(), "T1");
		Thread t2 = new Thread(new MulRunnable(), "T2");
		
		t1.start();
		t2.start();
		
		//Using Anonymous Runnable class
			Thread t3 = new Thread(() -> {
				System.out.println(Thread.currentThread().getName()+ " started");
				int res = 0;
				for(int i=1; i<20; i++) {
					if(i%2 == 0)
						res+=i;
				}
				System.out.println("Result =" +res+Thread.currentThread().getName()+" Ended");
			},"T3-EvenAdd");
		
		t3.start();
	}

}
