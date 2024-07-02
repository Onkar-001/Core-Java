public class SwapUseThird {
	public static void main(String[] args){
	int a , b, temp;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	temp = a;
	a = b;
	b = temp;
	System.out.println("A is " + a);
	System.out.println("B is " + b);
	
}
}