import java.util.Scanner;
class Program5
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int charge;
		if(days <= 5) {
			charge = days * 2;
				System.out.println(charge);
		} else  if (days >= 6 && days <= 10) {
			charge = days * 3;
				System.out.println(charge);
		} else if (days >= 11 && days <= 15) {
			charge = days * 4;
				System.out.println(charge);
		} else if(days > 15) {
			charge = days * 5;
				System.out.println(charge);
		} else {
			System.out.println("Enter valid  days");
		}
		
		}
	
}
