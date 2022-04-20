package lib;

public class TaxFunction {
	static int baseSalary;
	static int tax;
	static int numberOfChildren;
	
	public static int baseSalary(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible){
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		return baseSalary = (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible);
	}

	public static int familyTax(int numberOfChildren){
		
		if (workerParent.getChildIdNumber().size() > 3) {
			numberOfChildren = 3;
		}
		
		if (workerParent.getSpouseIdNumber().equals("")) {
			return tax = (int) Math.round(0.05 * (baseSalary - 54000000));
		}else {
			return tax = (int) Math.round(0.05 * (baseSalary - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}
	}
	
	public static int calculateTax() {
		familyTax(numberOfChildren);
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
