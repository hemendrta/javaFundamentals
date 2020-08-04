package javaFundamentals;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
//		Only one thread till here:
		
		MyThread myThread=new MyThread(); 
		
//		From the next line an new thread will be started by the main thread.
		
		myThread.start();
		
//		Start of the new thread along with the main thread, over all we have 2 threads which are main thread and mythread.
		
		for (int j=10;j<20;j++) {
			
			System.out.println("Value of j :"+j);
		}
		
	}
	
}

//Defining a Thread by extending Thread Class

class MyThread extends Thread{
	
//	Job or Task of Thread
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Value of i :"+i);
		}
		
	}
	
}