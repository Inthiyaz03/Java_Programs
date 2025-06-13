package com.tap;

import java.util.Scanner;

public class subStringOccurenceINString {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        String s = scanner.nextLine();
	        String sub = scanner.nextLine();
	        
            int count =0;
            int mainLength = s.length();
            int subLength = sub.length();

            for(int i=0;i<=mainLength - subLength;i++) {
            	if(s.substring(i ,i+subLength).equals(sub)) {
            		count++;
            	}
            }

	        System.out.println(count);
	    }
	}

