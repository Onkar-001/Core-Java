import java.util.Scanner;
class Program6
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String gender = sc.next();
		if(age >= 18 &&  age <30 ) {
			if(gender == "M" || gender == "Male") {
				System.out.println("Daily Wages is 700");
			} else {
				System.out.println("Daily Wages is 750");
			}
		} else if (age >= 30 &&  age <= 40) {
			if(gender == "M" || gender == "Male") {
				System.out.println("Daily Wages is 800");
			} else {
				System.out.println("Daily Wages is 850");
			}
		} else if (age >= 40 &&  age <= 50 ) {
			if(gender == "M" || gender == "Male") {
				System.out.println("Daily Wages is 900");
			} else {
				System.out.println("Daily Wages is 950");
			}
		} else if (age >= 50 &&  age <= 60 ) {
			if(gender == "M" || gender == "Male") {
				System.out.println("Daily Wages is 1000");
			} else {
				System.out.println("Daily Wages is 1000");
			}
		} else {
			System.out.println("Should be retired from work and take a rest");
		}

		}
	
}
