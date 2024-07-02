import java.util.Scanner;
class maxThree{
	public static void main(String[] args){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		num3 = sc.nextInt();

		if(num1>=num2 && num1 >= num3){
			System.out.println("Num1 is greater");
		} else if(num2>=num1 && num2 >= num3) {
			System.out.println("Num2 is greater");
		} else {
			System.out.println("Num3 is greater");
	}
	}
}

