import java.util.Scanner;
class Program3
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int costPrice = sc.nextInt();
		double tax;
		if(costPrice > 100000) {
			tax = (costPrice/100)*15;
			System.out.println(tax);
		} else if((costPrice > 50000) && (costPrice <= 100000)){
			tax = (costPrice/100)*10;
			System.out.println(tax);
		} else {
			tax = (costPrice/100)*5;
			System.out.println(tax);
		} 
	}
}