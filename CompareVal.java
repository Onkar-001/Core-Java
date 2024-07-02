import java.util.Scanner;
public class CompareVal {
	public static void main(String[] args){
	int num1 , num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number ");
	num1 = sc.nextInt();
	System.out.println("Enter second number ");
	num2 = sc.nextInt();
	String str = (num1 == num2)? "Both are equal numbers" : "Both are not equal numbers";
	System.out.println(str);
	}
}