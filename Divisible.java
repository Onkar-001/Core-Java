import java.util.Scanner;
class Divisible{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Enter the number");
	num = sc.nextInt();
	if(num%5==0 && num%11 == 0){
		System.out.println("It is divisible by both 5 & 11");
	} else {
		System.out.println("It is not divisible by both numbers");
	}
	}
}