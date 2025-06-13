package com.tap;

import java.util.Scanner;

class Adding extends Thread{
	
 @Override
public void run() {
	 System.out.println("Multiplying numbers Started: ");
     Scanner scanner = new Scanner(System.in);
     System.out.println(scanner.nextInt()*scanner.nextInt());
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Multiplying	has completed");
}
 
	
}


class PrintingCharacters extends Thread{
	
	
	
	
	@Override
	public void run() {
		printingNumbers p = new printingNumbers();
	    p.setDaemon(true);
	    p.start();
		System.out.println("Printing Characters Started: ");
        char c = 'A';
        for(int i=0; i<5; i++){
            System.out.println(c);
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// sleep for 500 milliseconds before printing next character
            c++;
	}
        System.out.println("Printing Characters Ended: ");
    
}
}



class printingNumbers extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
		}
		System.out.print("printing  numbers ended");
	}
	
}



public class MultiThreading {

	public static void main(String[] args) {
		
		Adding a = new Adding();
		PrintingCharacters c = new PrintingCharacters();
		

		a.start();
		c.start();
      
		
	}
}



