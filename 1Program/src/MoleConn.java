import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MoleConn {

	public static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

//		largestInList();
//		FreqCharOfString();
//		mergeTwoSortedList();
//		secLargeFromList();
//		isAnagram();
		findDupliInList();

	}

	private static void findDupliInList() {
		int n = scanner.nextInt();
		List<Integer> li = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			li.add(scanner.nextInt());
		}

		Map<Integer, Integer> freqMap = new LinkedHashMap<>();

		for (int i = 0; i < li.size(); i++) {
			int num = li.get(i);

			if (freqMap.containsKey(num)) {
				freqMap.put(num, freqMap.get(num) + 1);
			} else {
				freqMap.put(num, 1);
			}
		}

		int maxFreq = Collections.max(freqMap.values());

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() == maxFreq) {
				System.out.println(entry.getKey());
			}
		}
	}

	private static void isAnagram() {
		// TODO Auto-generated method stub

		String str1 = scanner.next();
		String str2 = scanner.next();

		if (str1.length() != str2.length()) {
			System.out.println("No");
			return;
		}

		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		boolean isAnagram = Arrays.equals(charArray1, charArray2);

		if (isAnagram) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

	private static void secLargeFromList() {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		List<Integer> li = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			li.add(scanner.nextInt());
		}

		Collections.sort(li);
		System.out.println(li.get(n - 2));

	}

	private static void mergeTwoSortedList() {
		// TODO Auto-generated method stub
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();

		for (int i = 0; i < a; i++) {
			li1.add(scanner.nextInt());

		}

		for (int i = 0; i < b; i++) {
			li2.add(scanner.nextInt());
		}

		li1.addAll(li2);
		Collections.sort(li1);
		System.out.println(li1);

	}

	private static void FreqCharOfString() {
		// TODO Auto-generated method stub
		String s = scanner.nextLine();
		char ch[] = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}

	}

	private static void largestInList() {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());

		}

		int max = list.get(0);

		for (int i = 1; i < n; i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}

		}
		System.out.println(max);
	}

}
