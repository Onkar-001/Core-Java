import java.util.Scanner;

public class PrintASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0);

        int ASCIIValue = (int) character;
        System.out.println("The ASCII value of " + character + " is: " + ASCIIValue);
    }
}