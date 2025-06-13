import java.util.Scanner;

public class secondLargestPlaindromicSubstring {

	private static int count;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr [] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(secLarge(arr));
	}

	private static int secLarge(int [] arr) {
		
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
        for (int i = 0; i < arr.length; i++) {
        		
        	int count = 0;
            
            if (count > max) {
                secondMax = max;
                max = count;
            } else if (count > secondMax && count < max) {
                secondMax = count;
            
            }
          }
		return secondMax;
        }
	}