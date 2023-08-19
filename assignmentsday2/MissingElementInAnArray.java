package week1.day2.assignmentsday2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				Arrays.sort(arr);
				
				 // Loop through the array
		        for (int i = 0; i < arr.length; i++) {
		            // Check if the iterator variable is not equal to the array value
		            if (i + 1 != arr[i]) {
		                // Print the number
		                System.out.println(i + 1);
		                // Break the iteration
		                break;
		            }
		        }
				
	}

}
