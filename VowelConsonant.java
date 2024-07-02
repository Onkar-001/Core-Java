import java.util.Scanner;
class VowelConsonant{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.println("Enter the character");
	ch = sc.nextLine().charAt(0);
	if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ) {
		System.out.println("Vowel");
	} else {
		System.out.println("Consonant");
	}
  }
}