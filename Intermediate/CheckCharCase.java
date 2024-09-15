import java.util.Scanner;
public class CheckCharCase {
	public static void main(String[] args){
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character");
	ch = sc.next().charAt(0);
	String str = (ch >= 'a' && ch <= 'z')? "It is lower case alphabet" : (ch >= 'A' && ch <= 'Z')? "It is the Upper case alphabet" : "Please Enter valid Character";
	System.out.println(str);
	}
}