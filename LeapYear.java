import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
	int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();

        String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "This is a leap year" : "This is not a leap year";
        System.out.println(year + " " + result);
    }
}
