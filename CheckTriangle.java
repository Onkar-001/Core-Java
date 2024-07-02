import java.util.Scanner;
public class CheckTriangle{
	public static void main(String[] args){
	int angle1, angle2, angle3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first angle");
	angle1 = sc.nextInt();
	System.out.println("Enter the second angle");
	angle2 = sc.nextInt();
	System.out.println("Enter the third angle");
	angle3 = sc.nextInt();
	String str = ((angle1 == angle2) && (angle2 == angle3)) ? "It is equilateral triangle" : ((angle1 == angle2) || (angle1 == angle3) || (angle2 == angle3))? "It is isosceles triangle" : "It is scalene triangle";
	System.out.println(str);
	
	}
}

// f f	