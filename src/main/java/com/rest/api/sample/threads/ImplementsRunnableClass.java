package com.rest.api.sample.threads;

public class ImplementsRunnableClass  implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i value for Thread:"+Thread.currentThread().getName()+" is :"+i);
			
		}
		
	}

}
