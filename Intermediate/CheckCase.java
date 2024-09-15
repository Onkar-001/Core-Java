import java.util.Scanner;
public class CheckCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.nextLine().charAt(0);
		if(ch >= 65 && ch <=90){
			System.out.println("It is uppercse character");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("It is lowercase character");
		}
	}
}