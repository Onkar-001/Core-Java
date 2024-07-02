import java.util.Scanner;
class NeonNum {
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int Num;
	 System.out.println("Enter the Number");
	 Num = sc.nextInt();
         int Sqr = Num * Num;
	 int lastNum = Sqr % 10;
	 int firstNum = Sqr / 10;
	 int Sum = firstNum + lastNum;
	 String str = (Num == Sum) ? "It is Neon Number" : "It is not Neon Number";
	 System.out.println(str);
	}
}