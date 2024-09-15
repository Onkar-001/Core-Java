import java.util.Scanner;
public class CheckChar{
	public static void main(String[] args){
	int input;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input");
	input = sc.next().charAt(0);
	String str = (input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')? "It is a character" : (input >= '0' && input <= '9')? "It is a digit" : "It is Special Character";
	
	System.out.println(str);
	}
}