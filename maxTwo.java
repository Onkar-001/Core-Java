import java.util.Scanner;
class maxTwo{
	public static void main(String[] args){
		int num1, num2;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		if(num1>num2){
			System.out.println("Num1 is greater");
		} else {
			System.out.println("Num2 is greater");
		}
	}
}

