import java.util.Scanner;
public class NoCubeForthPower {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        double val = sc.nextDouble();

       	System.out.println("Cube: " + val * val * val);
        System.out.println("Fourth power: "+ val * val * val * val);
    }
}
