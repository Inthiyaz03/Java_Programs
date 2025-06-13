package com.tap;

class Warriors extends Thread {

	String res1 = "Brahmastram";
	String res2 = "Pashupathastram";
	String res3 = "Sarpastram";

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Arjuna")) {
			arjuna();
		} else {
			karna();
		}
	}

	public void arjuna() {

		try {
			Thread.sleep(5000);

			synchronized (res1) {
				System.out.println("Arjuna acquired Brahmastram");
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Arjuna acquired Pashupathastram");
					Thread.sleep(5000);
					synchronized (res3) {
						System.out.println("Arjuna acquired sarpathastram");
						Thread.sleep(5000);

					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void karna() {
		try {
			Thread.sleep(5000);

			synchronized (res3) {
				System.out.println("karna acquired sarpathastram");
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("karna acquired Pashupathastram");
					Thread.sleep(5000);
					synchronized (res1) {
						System.out.println("karna acquired Brahmastram");
						Thread.sleep(5000);
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) {

		Warriors w1 = new Warriors();
		w1.setName("Arjuna");

		Warriors w2 = new Warriors();
		w2.setName("Karna");

		w1.start();
		w2.start();
	}
}