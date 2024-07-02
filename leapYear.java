import java.util.Scanner;
class leapYear{
	public static void main(String[] args){
		int year;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year : ");
	year = sc.nextInt();
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
		System.out.println("Its leap year");
	} else {
		System.out.println("Its not leap year");
	}
	}
}