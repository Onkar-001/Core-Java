import java.util.Scanner;
class PersonHeight{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int PerHeight;
	System.out.println("Enter the Person height");
	PerHeight = sc.nextInt();
	String str = (PerHeight < 150.0) ? "The Person is Dwarf" : ((PerHeight >= 165.0) && (PerHeight < 165.0)) ? "The person is average heighted" : ((PerHeight >= 165.0) && (PerHeight  <= 195.0 )) ? "The Person is Taller" : "Please Enter the Valid Height";
	System.out.println(str);
	}
}