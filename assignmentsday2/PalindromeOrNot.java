package week1.day2.assignmentsday2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		

		int num=34343;
		int reversedNum=0;
		int temp,rem;
		
		temp=num;
		for (reversedNum = 0; num >0; num/=10)
		{
			rem=num%10;
			reversedNum=(reversedNum*10)+rem;
		}
		
		if (temp==reversedNum)
		{
		System.out.println("Given number is a Palindrome.");
		} 
		else 
		{
		System.out.println(" Given number is not a Palindrome.");
		}
		
	}
}
