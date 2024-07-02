import java.util.Scanner;
public class TVVolumeApp{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int IncVol, NexVol;
	System.out.println("Enter Initial Volume");
	IncVol = sc.nextInt();
	System.out.println("Enter Next Volume");
	NexVol = sc.nextInt();
	String str = IncVol > NexVol ? "Volume is decrease and button press " + (IncVol - NexVol)+ " number of times": "Volume is increase and button press " + (NexVol - IncVol) + " number of times";
	System.out.println(str);
	}
}