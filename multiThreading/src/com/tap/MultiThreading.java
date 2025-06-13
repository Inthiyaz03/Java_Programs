package com.tap;



class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("hi");
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("hello");
	}
}

class Thread3 implements Runnable{

	@Override
	public void run() {
		System.out.println("who");
		
	}
	
}
class Thread4 implements Runnable{

	@Override
	public void run() {
		System.out.println("yu");
	}
	
}



public class MultiThreading {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println("------------------");
		
		Thread3 t3 = new Thread3();
		Thread4 t4  = new Thread4();
		
		Thread t5 = new Thread(t3);
		Thread t6 = new Thread(t4);
		t5.start();
		t6.start();
		
		
		
	}
}
