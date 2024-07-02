import java.util.Scanner;
class Program7
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
	    int age = sc.nextInt();
		System.out.println("Enter Gender :");
		char gender = sc.next().charAt(0);
		System.out.println("Are you Married ? True/False :");
		boolean isMarried = sc.nextBoolean();
		if(isMarried == true) {
			System.out.println("You are eligible for the insurance");
		} else if(isMarried == false) {
			if((gender == 'M' && age >= 30)) {
				System.out.println("You are eligible for the insurance");
			} else if ((gender == 'F' && age >= 25))
			{
				System.out.println("You are eligible for the insurance");
			} else {
				System.out.println("You are not eligible for the insurance");
			}
		}
		else {
				System.out.println("You are  not eligible for the insurance");
		}
	}
}