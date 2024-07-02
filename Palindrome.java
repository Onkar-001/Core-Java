import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int number , rev = 0, m, r;
	
        System.out.print("Enter a number : ");
        number = sc.nextInt();
	m = number;
	while (m!=0)
	{
		r = m % 10;
		rev = rev * 10 + r;
		m = m / 10;
	
	}
	String str = (number == rev) ? "It is palindrome" : "It is not Palindrome";
	System.out.println(str);
	       
    }
}
