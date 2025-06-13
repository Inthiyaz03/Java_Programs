package com.tap;

class Queue {

	private int data;
	boolean isDataPresent = false;

	public synchronized void setData(int data) {
		if (isDataPresent == false) {
			this.data = data;
			System.out.println("producer produced the " + data);
			isDataPresent = true;
			notify();
		} else {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public synchronized void getData() {

		if (isDataPresent == true) {
			System.out.println("Consumer consumed the data " + data);
			isDataPresent = false;
			notify();
		} else {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Producer extends Thread {

	Queue q;

	public Producer(Queue q) {
		this.q = q;

	}

	@Override
	public void run() {
		int i = 1;
		for (;;) {
			q.setData(i++);
		}

	}
}

class Consumer extends Thread {

	Queue q;

	public Consumer(Queue q) {
		this.q = q;

	}

	@Override
	public void run() {
		for (;;) {
			q.getData();
		}

	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		Producer p = new Producer(q);
		p.setName("producer");
		Consumer c = new Consumer(q);
		c.setName("consumer");
		p.start();
		c.start();
	}

}
