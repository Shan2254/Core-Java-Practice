package com.Practice;

class MyThread extends Thread {
	
	String threadName;
	
	MyThread(String name) {
		this.threadName = name;
	}
	
	public void run() {
		System.out.println("Thread "+ threadName + " is running.");
	}
}

public class ThreadExecution {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		
		t3.start();
		t3.join();
		
		t2.start();
		t2.join();
		
		t1.start();
		t1.join();
	}
}
