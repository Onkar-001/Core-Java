public class SwapWithoutUseThird {
	public static void main(String[] args){
	int a , b;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	a = a + b;
	b = a - b;
	a = a - b;	
	System.out.println("A is " + a);
	System.out.println("B is " + b);
	
}
}

//Write a java program to calculate compound interest