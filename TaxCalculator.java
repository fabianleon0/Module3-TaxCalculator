import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double weeklyIncome;
		double taxRate;
		double taxWithhold;
		
		System.out.print("Please enter weekly income:$");
		
		weeklyIncome = input.nextDouble();
		
		if (weeklyIncome < 500) {
			taxRate = .10;	
		}
		else if(weeklyIncome < 1500) {
			taxRate = .15;
		}
		
		else if(weeklyIncome < 2500) {
			taxRate = .20;
		}
		
		else {
			taxRate = .30;
		}
		
		taxWithhold = weeklyIncome * taxRate;
		
		System.out.println("Tax Summary (Weekly)");
		
		System.out.println("Weekly Income: $" + weeklyIncome);
		
		System.out.println("Tax Rate: " + (taxRate * 100) + "%");
		
		System.out.println("Weekly Tax Witholding: $" + taxWithhold);
		
		input.close();
		
	}
	

}
