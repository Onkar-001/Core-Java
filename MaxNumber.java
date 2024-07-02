import java.util.Scanner;
public class MaxNumber {
	public static void main(String[] args) {
	int firstNumber, secondNumber;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	firstNumber = sc.nextInt();

	System.out.println("Enter second number");
	secondNumber = sc.nextInt();
	
	int MaxNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;

	System.out.println("The Maximum No is " + MaxNumber);	

	}
}