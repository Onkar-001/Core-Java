public class TempCel {
	 public static void main (String args[])  
    { 
	float Fahrenheit, Celsius;  
          Fahrenheit = Float.parseFloat(args[0]);  
          Celsius  = ((Fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  

}

}