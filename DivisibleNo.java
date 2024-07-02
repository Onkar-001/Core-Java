import java.util.Scanner;
public class DivisibleNo {
	public static void main(String[] args){
	int num;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Number");
	num = sc.nextInt();
	
	String Result = ((num%5 == 0) && (num%11 == 0) ) ? "The no is divisible" : "The no is not divisible";
	System.out.println(Result);
	}
}