package week1.day2.assignmentsday2;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
int n=8,firstNum=0, secNum=1, sum;
System.out.println("Fibonacci Series");
System.out.println(firstNum);
System.out.println(secNum);

for (int i = 1; i <=n; i++) {
	sum=firstNum+secNum;
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
}
	
	}

}
