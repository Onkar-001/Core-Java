import java.util.Scanner;

public class ReverseNo
{
   public static void main(String[] args)
   {
      int num, remainder, reverse=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = sc.nextInt();
      
      while(num!=0)
      {
         remainder = num%10;
         reverse = (reverse*10) + remainder;
         num = num/10;
      }
      
      System.out.println("The Reverse no is = " +reverse);
   }
}