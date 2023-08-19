package week1.day2.assignmentsday2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int number=13;// Declare an input and assign a value 13
		boolean flag=false;// Declare a boolean variable flag as false
		
		// Iterate from 2 to half of the input
		for (int i = 2; i <= number / 2; ++i)
		{    
			 // Divide the input by each value of the loop variable and check the remainder
		      if (number % i == 0) 
		      {
		        flag = true;// Set the flag as true when there is no remainder
		        break;// break the iterator
		      }
		 }
		 // Check the flag
		    if (!flag)
		    {
		      System.out.println(number + " is a prime number.");// Print 'Prime'
		    }
		    else
		    {
		      System.out.println(number + " is not a prime number."); // Print 'Not a Prime'
		    }
		    

	}

}
