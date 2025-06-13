import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//
//		}
//		uniqueTriplets(arr);
		
		 
		String s = scanner.nextLine();
		minRemovalPlaindrome(s);
	}

	private static void minRemovalPlaindrome(String s) {
		
		
		
	}

	private static void uniqueTriplets(int[] arr) {
		// TODO Auto-generated method stub

		int sum = 0;
		boolean f = false;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = i + 2; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						f = true;
					}
				}
			}
		}
		if (!f) {
			System.out.println("triplets not found");

		}
	}
}
