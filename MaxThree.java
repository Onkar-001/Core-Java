import java.util.Scanner;
public class MaxThree {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int Num1, Num2, Num3;
	System.out.println("Enter first number");
	Num1 = sc.nextInt();
	System.out.println("Enter second number");
	Num2 = sc.nextInt();
	System.out.println("Enter third number");
	Num3 = sc.nextInt();
	String str = (Num1 >= Num2 && Num1 >= Num3) ? "First Number is greater" : (Num2 >= Num1 && Num2 >= Num3) ? "Second Number is greater" : "Third Number is greater";
	System.out.println(str);
	}
}