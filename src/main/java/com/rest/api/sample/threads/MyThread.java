package com.rest.api.sample.threads;

public class MyThread {
	public static void main(String[] args) {
		ExtendThreadClass etc = new ExtendThreadClass();
		etc.start();
		System.out.println("Thread Name::: "+etc.getName());
		
		ExtendThreadClass etc1 = new ExtendThreadClass();
		etc1.run();
		etc1.start();
		etc1.setName("varun");
		System.out.println("Thread Name::: "+etc1.getName());
		SampleThread st = new SampleThread();
		st.run();
		
		
		
		ImplementsRunnableClass irc = new ImplementsRunnableClass();
		/*
		 * Thread t = new Thread(irc); Thread foo = new Thread(irc);
		 * 
		 * Thread bar = new Thread(irc,"bar"); Thread bat = new Thread("bat"); t.run();
		 * System.out.println(foo.getName()); //bar.setName("bar");
		 * System.out.println(bar.getName()); System.out.println(bat.getName());
		 */
		Thread tt = null;
		
		for (int i = 0; i <= 10; i++) {
			
			 tt = new Thread(irc);
			 
			tt.setName("Varun-"+i);
			if(tt.getName().equals("Varun-0")) {
				tt.setPriority(10);
			}else{
				tt.setPriority(1);
			}
			tt.start();
		}
	}
}
