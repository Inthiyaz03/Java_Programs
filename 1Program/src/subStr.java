import java.util.Scanner;

public class subStr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		System.out.println(longSufAndPrefRevIndexSame(str));
	}

	private static String longSufAndPrefRevIndexSame(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		for (int i = n;i>0;i--) {
			String prefix = str.substring(0,i);
			String suffix = str.substring(n-i);
			StringBuilder sb = new StringBuilder(suffix);
		
			if(prefix.equals(sb.reverse().toString())) {
				return prefix;
			}
			
		}
		return "none";
	}
}
