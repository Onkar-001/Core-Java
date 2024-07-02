import java.util.Scanner;
public class CourseCapApp {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int MM , NN , KK;
	System.out.println("Enter the Capacity of Student to enroll the course");
	MM = sc.nextInt();
	System.out.println("Enter the Student who have already enroll the course");	
	KK = sc.nextInt();
	System.out.println("Enter the New Student who have to be enroll the course");
	NN = sc.nextInt();
	int Capacity = MM - KK;
	String str = (Capacity >= NN) ? "Yes" : "No";
	System.out.println(str);
	}
}