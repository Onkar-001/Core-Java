import java.util.Scanner;
class StudentResult {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Physics Marks: ");
	int Physics = sc.nextInt();
	System.out.println("Enter Chemistry Marks: ");
	int Chemistry = sc.nextInt();
	System.out.println("Enter Biology Marks: ");
	int Biology = sc.nextInt();
	System.out.println("Enter Mathematics Marks: ");
	int Mathematics = sc.nextInt();
	System.out.println("Enter Computer Marks: ");
	int Computer = sc.nextInt();
	int total = Physics + Chemistry + Biology + Mathematics + Computer;
	int Percentage = total / 5;
	String str = ( Percentage >= 90 ) ? "First Grade" : (Percentage >= 80 ) ? "Second Grade" : (Percentage >= 70) ? "Third Grade" : "Fail";
	System.out.println(str); 
	}
}