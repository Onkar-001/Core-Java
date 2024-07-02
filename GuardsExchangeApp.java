import java.util.Scanner;
class GuardsExchangeApp	{
	public static void main(String[] args)
	{
	int XX , YY;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the XX no of the guards");
	XX = sc.nextInt();
	System.out.println("Enter thr YY no of the guards");
	YY = sc.nextInt();
	String str = (XX == YY) ? "Ezion can Manipulate the all guards" : (YY >= XX) ? "Ezion can manipulate the all XX guards" : "Ezion cannot manipulate the guards";
	System.out.println(str);
	}
}