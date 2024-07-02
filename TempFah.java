public class TempFah  
 {  
   public static void main (String args[])  
    { 
	float Fahrenheit, Celsius;  
         Celsius = Float.parseFloat(args[0]);
          Fahrenheit  = (Celsius * 9 /5) + 32;  
          System.out.println("Temperature in Fahrenheit is: "+ Fahrenheit);  
    }
}  