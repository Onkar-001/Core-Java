import java.util.Scanner;
class Program2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Maths = sc.nextInt();
		int Physics = sc.nextInt();
		int Chemistry = sc.nextInt();
		if(Maths>=65 && Physics>=55 && Chemistry >=50){
			if(((Maths + Physics + Chemistry) >= 190) || ((Maths + Physics)>= 140)){
				System.out.println("Candidate can be eligible for addmission");
			} else {
				System.out.println("Candidate is not be eligible for addmission");
			}
		} else {
			System.out.println("Candidate fail in some subject");
		}
	}
}
