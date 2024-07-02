public class StudentResult {  
   public static void main (String args[])  
    {   
	int sub1, sub2, sub3, sub4, sub5,total;
	float percentage;
	sub1 = Integer.parseInt(args[0]); 
	sub2 = Integer.parseInt(args[1]);
	sub3 = Integer.parseInt(args[2]);
	sub4 = Integer.parseInt(args[3]);
	sub5 = Integer.parseInt(args[4]);
	total = sub1 + sub2 + sub3 + sub4 + sub5;
	percentage  = total/5;  
	System.out.println("Total marks of student is: "+ total);  
	System.out.println("Percentage of student is: "+ percentage);  
    }
}  