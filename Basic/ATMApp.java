
import java.util.Scanner;
public class ATMApp
{
   public static void main(String x[])
    {  
	Scanner sc  = new Scanner(System.in);
	int maxBalance=2000, avlBalance, wAmount;
        float  bankCharges=0.5f;
        System.out.println("Enter account balance");
        avlBalance=sc.nextInt();
        System.out.println("Enter withdraw amount");
	wAmount=sc.nextInt();
	
      String str=avlBalance<=maxBalance? (wAmount<avlBalance && wAmount%5==0?"Remaining Balance "+((avlBalance-wAmount)-bankCharges):"insufficent  fund"):"available balnace should be less than 2000";
     System.out.println(str);
    }
}
