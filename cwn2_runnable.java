package Multithreading;
	class MyThreadRunnable1 implements Runnable{
		public void run() {
			System.out.println("Iam a Thread1 Not a Thread");
		}
	}

	class MyThreadRunnable2 implements Runnable{
		public void run() {
			System.out.println("Iam a Thread2 Not a Thread");

		}
	}
	public class cwn2_runnable {
		public static void main(String[] args) {
			MyThreadRunnable1 o1 = new MyThreadRunnable1();
			MyThreadRunnable2 o2 = new MyThreadRunnable2();
			Thread t1 = new Thread(o1);
			Thread t2 = new Thread(o2);
			t1.start();
			t2.start();
		}
	}


