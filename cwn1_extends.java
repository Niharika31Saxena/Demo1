package Multithreading;
	class MyThread1 extends Thread{
		@Override
		public void run() {
			int i=0;
			while(i<10) {
				System.out.println("My Thread is Running");
				System.out.println("Iam Happy");
			}
		}
	}

	class MyThread2 extends Thread{
		@Override
		public void run() {
			int i=0;
			while(i<10) {
				System.out.println("Thread Two is Good");
				System.out.println("Iam Sad");
			}
		}
	}
	public class cwn1_extends {
		public static void main(String[] args) {
			MyThread1 t1 = new MyThread1();
			MyThread2 t2 = new MyThread2();
			t1.start();
			t2.start();
		}
	}

