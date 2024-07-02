import java.util.Scanner;
public class IntegerToSequence {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int input = sc.nextInt();
        int n1 = input / 100000 % 10;  
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }
}


//123456/100000 % 10 
// 01%10 => 1

//123456/10000 % 10
// 12%10 => 2

//123456/1000 % 10
// 123%10 => 3

//123456/100 % 10
// 1234%10 => 4

//12345/10 % 10
// 12345%10 => 5

//123456 % 10 => 6

