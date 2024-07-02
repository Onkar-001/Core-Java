import java.util.Scanner;
public class EmployeeSal {
    public static void main(String[] args) {
	int basicSalary;
	double da, hra, grossSalary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        basicSalary = sc.nextInt();
        
        hra = (basicSalary <= 10000) ? 0.2 * basicSalary : (basicSalary <= 20000) ? 0.25 * basicSalary : 0.3 * basicSalary;
        
        da = (basicSalary <= 10000) ? 0.8 * basicSalary :  (basicSalary <= 20000) ? 0.9 * basicSalary : 0.95 * basicSalary;

        grossSalary = basicSalary + hra + da;
        
        System.out.println("Basic Salary is : " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
         }
}
