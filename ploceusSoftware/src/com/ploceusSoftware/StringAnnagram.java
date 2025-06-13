package com.ploceusSoftware;

import java.util.Scanner;

public class StringAnnagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		System.out.println(isAnagram(s1, s2));
	}

	private static char[] isAnagram(String s1, String s2) {
		char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        
        if (c1.length!=c2.length) {
            return null;
        }
        
        int[] count = new int[26];
        for (char c : c1) {
            count[c - 'a']++;
        }
        
        for (char c : c2) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return null;
            }
        }
        
        return c1;
		
	}
}
