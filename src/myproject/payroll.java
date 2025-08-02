/*write a java program to create an employee
  pYROLL SYSYTEM BY REading the empidd basic salary hra da and pf of the 
  employee and calc the basic hra percent da percent and calc the gross salary. 
 from the gross deduct th pf amount and add a fixed bonus . and whether person is eligible for loan or not*/
/*sal float hra -percentage da-percetnalge pf-percentage id 
 * gross>20k pf>1000*/
import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Section
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        float basicSalary = sc.nextFloat();

        System.out.print("Enter HRA amount: ");
        float hra = sc.nextFloat();

        System.out.print("Enter DA amount: ");
        float da = sc.nextFloat();

        System.out.print("Enter PF amount: ");
        float pf = sc.nextFloat();
        float hraPercent = (hra / basicSalary) * 100;
        float daPercent = (da / basicSalary) * 100;

        float grossSalary = basicSalary + hra + da;
        float netSalary = grossSalary - pf;
        
        System.out.print("Enter bonus ");
        float bonus= sc.nextFloat();
        
        System.out.println("\n Employee Payroll Details");
        System.out.println("Employee ID: " + empId);
        System.out.printf("Basic Salary: ₹%.2f\n", basicSalary);
        System.out.printf("HRA: ₹%.2f (%.2f%%)\n", hra, hraPercent);
        System.out.printf("DA: ₹%.2f (%.2f%%)\n", da, daPercent);
        System.out.printf("Gross Salary: ₹%.2f\n", grossSalary);
        System.out.printf("PF Deduction: ₹%.2f\n", pf);
        System.out.printf("Bonus Added: ₹%.2f\n", bonus);
        System.out.printf("Final Salary (Net + Bonus): ₹%.2f\n", netSalary+bonus);

    }
}

}
