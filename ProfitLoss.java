import java.util.Scanner;
public class ProfitLoss{
	public static void main(String[] args){
	int costPrice, sellPrice;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Cost Price");
	costPrice = sc.nextInt();
	System.out.println("Enter the Selling Price");
	sellPrice = sc.nextInt();
	String str  = (costPrice < sellPrice) ? "You are in Profit" : "You are in Loss";
	System.out.println(str);
	}
}