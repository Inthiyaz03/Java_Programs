package com.tap;
import java.util.Scanner;

public class SearchInsertPosition {
    
    // Function to find the target or the insert position using binary search
    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;  // Target found
            } else if (nums[mid] < target) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1;  // Search in the left half
            }
        }
        
        // Return the index where the target would be inserted
        return left;
    }

    public static void main(String[] args) {
        // Read input from user
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  // Number of elements in the array
        int[] nums = new int[n];
        
        // Reading the sorted array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Reading the target value
        int target = scanner.nextInt();
        
        // Output the index (either found or insertion point)
        System.out.println(searchInsertPosition(nums, target));
        
        scanner.close();
    }
}

