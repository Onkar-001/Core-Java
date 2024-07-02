import java.util.Scanner;
class ProfitLoss{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost price");
		int costPrice = sc.nextInt();
		System.out.println("\n Enter the selling price");
		int sellPrice = sc.nextInt();
		if(sellPrice > costPrice)
			System.out.println("Profit");
		else
			System.out.println("Loss");
	}
}