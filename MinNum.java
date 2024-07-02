import java.util.Scanner;
class MinNum {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int num1 , num2, num3;
	System.out.println("Enter the first number");
	num1 = sc.nextInt();
	System.out.println("Enter the second number");
	num2 = sc.nextInt();
	System.out.println("Enter the third number");
	num3 = sc.nextInt();
	String str = (num1 <= num2) && (num1 <= num3) ? "Num1 is the minimum number" : ((num2 <= num1) && (num2 <= num3)) ? "Num2 is the minimum number" : "Num3 is the minimum number";
	System.out.println(str);
	}
}