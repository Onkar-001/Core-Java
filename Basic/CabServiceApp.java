import java.util.Scanner;
public class CabServiceApp
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int XX, YY;
	System.out.println("Enter first cab service charges");
	XX=sc.nextInt();
	System.out.println("Enter second cab service charges");
	YY=sc.nextInt();
	String str=XX==YY?"Choose Any Cab":(XX>YY?"Chef choose second cab":"Chef choose first cab");
	System.out.println(str);
	}
}