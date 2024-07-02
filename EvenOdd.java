import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] agrs){
	int no;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number :");
	no = sc.nextInt();
	
	String result = (no%2==0) ? "The No is Even" : "The No is Odd";
	System.out.println(result);
	
	}
}