import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
        int firstAngle , secondAngle ,thirdAngle ;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first angle");
	firstAngle = sc.nextInt();
	
        System.out.println("Enter second angle");
	secondAngle = sc.nextInt();

 	System.out.println("Enter third angle");
	thirdAngle = sc.nextInt();

  
        String result = (firstAngle + secondAngle + thirdAngle > 180) ? "Triangle is not Valid" : "Triangle is Valid";
        System.out.println(result);
    }
}