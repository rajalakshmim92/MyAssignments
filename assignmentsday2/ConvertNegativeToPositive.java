package week1.day2.assignmentsday2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-40;
		if(a<0) {
			System.out.println(a+"is a Negative Number");
			a=a*-1;
		System.out.println("Conversion of negative to positive:" +a);
		}
else if(a>0) {
			
			System.out.println("The number is Positive");
		}
		else {
			System.out.println("The number is neither Positive nor Negative");
		}
	}

}
