import java.util.Scanner;
class Triangle{
	public static void main(String[] args){
	int angle1 , angle2, angle3, sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first angle: ");
	angle1 = sc.nextInt();
	System.out.println("Enter the second angle: ");
	angle2 = sc.nextInt();
	System.out.println("Enter the third angle: ");
	angle3 = sc.nextInt();
	sum = angle1 + angle2 + angle3;
	if(sum > 180){
		System.out.println("Invalid Triangle");
	} else {	
		System.out.println("Valid Triangle");
	}
    }
}
