import java.util.Scanner;
class CheckIQApp{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int XX;
	System.out.println("Enter the Current IQ of Chef");
        XX = sc.nextInt();
	int ChefIQ = XX + 7;
	int EinsteinIQ = 170;
	String str = (ChefIQ >= EinsteinIQ) ? "Yes" : "No";
	System.out.println(str);
	}
}