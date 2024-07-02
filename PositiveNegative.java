import java.util.Scanner;
class PositiveNegative {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num = sc.nextInt();
    if(num > 0){
      System.out.println("Postive");
    } else if (num < 0) {
      System.out.println("Negative");
    }
      else {
	System.out.println("Zero");
	}
  }
}
     