package com.effigo.java_training_effigo.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 10; i++) {
			int requestId = i;

			executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Processing request " + requestId + " on thread " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Request " + requestId + " processed on thread " + Thread.currentThread().getName());
                }
            });
		}

		executorService.shutdown();
	}

}
