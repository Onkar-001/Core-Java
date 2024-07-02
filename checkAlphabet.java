import java.util.Scanner;
class checkAlphabet {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch;
    System.out.println("Enter the character");
    ch = sc.nextLine().charAt(0);
    if((ch >= 65 && ch >= 90) && (ch >= 97 && ch <= 122)){
      System.out.println("Alphabet");
    }   else {
	System.out.println("Not Alphabet");
	}
  }
}
     