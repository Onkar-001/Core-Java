public class Circle {

	public static void main(String[] args){
	int radius, diameter;	
	radius = Integer.parseInt(args[0]);
	diameter = 2 * radius;
	float PI = 3.14f, circumference;
	circumference = 2 * PI * radius;
	System.out.println("The Diameter of a Circle is  " + diameter);
	System.out.println("The Circumference of a Circle is  " + circumference);
	
}

}