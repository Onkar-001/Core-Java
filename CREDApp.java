import java.util.Scanner;
class CREDApp{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int XX , minScore = 750;
	System.out.println("Enter the Current Credit Score");
	XX = sc.nextInt();
	String str = ( XX >= 750) ? "It is possible to access CRED programs" : "It is not possible to access CRED Programs";
	System.out.println(str);
	}
}
