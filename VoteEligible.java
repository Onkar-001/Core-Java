import java.util.Scanner;
public class VoteEligible {
	public static void main(String[] args){
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Age");
	age = sc.nextInt();
	String str = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
	System.out.println(str);
	}
}