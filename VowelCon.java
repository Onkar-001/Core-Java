import java.util.Scanner;
public class VowelCon {
	public static void main(String[] args){
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Character");
	ch = sc.next().charAt(0);
	
	String str = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "It is Vowel" :  "It is consonant" ;
	
 	System.out.println(str);
	
	}
}