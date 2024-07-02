import java.util.Scanner;
public class CheckNum {
	public static void main(String[] args){
	int no;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	no = sc.nextInt();
	String str = ( no > 0 ) ? "It is positive" : (no < 0 ) ? "It is negative" : "It is zero";
	System.out.println(str);
	}
}