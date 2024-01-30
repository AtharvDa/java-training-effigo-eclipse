package com.effigo.java_training_effigo.multithreading;

public class UsingThreadClass {
	public static void main(String[] args) {
		Thread thread1 = new NumberPrinter("Thread 1");
		Thread thread2 = new NumberPrinter("Thread 2");

		// Starting the threads
		thread1.start();
		thread2.start();
	}
}

class NumberPrinter extends Thread {
	private final String threadName;

	public NumberPrinter(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(threadName + ": " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}