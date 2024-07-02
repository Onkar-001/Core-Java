public class EquiTriangle  
 {  
   public static void main (String args[])  
    {   float side;   
	side = Float.parseFloat(args[0]);
        double area = ( 1.73 * side * side) / 4 ;  
	System.out.println("Area of Equilateral Triangle is: "+ area);  
    }
}  