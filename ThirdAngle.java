public class ThirdAngle  
 {  
   public static void main (String args[])  
    { 
	float Angle1, Angle2, Angle3;  
         Angle1 = Float.parseFloat(args[0]);
         Angle2 = Float.parseFloat(args[0]);
          Angle3 = 180 - (Angle1 + Angle2);  
          System.out.println("Third Angle is: "+ Angle3);  
    }
}  