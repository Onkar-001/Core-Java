import java.util.Scanner;
class Program4
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalDay = sc.nextInt();
		int absentDay = sc.nextInt();
		int present = totalDay - absentDay;
		int percentage = (present*100)/totalDay;
		if(percentage < 75){
			System.out.println("You are not able to exam");
		} else {
			System.out.println("You are able to exam");
		}
	}
}