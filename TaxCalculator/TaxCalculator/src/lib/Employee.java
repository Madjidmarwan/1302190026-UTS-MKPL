package lib;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Employee extends TaxFunction{
	private String employeeId;	
	private Date dateJoined;
	private int monthWorkingInYear;
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	Person worker = new Person();
	Family workerParent = new Family();

	public Employee(String employeeId, Date dateJoined, int monthWorkingInYear) {
		this.employeeId = employeeId;
		this.dateJoined = dateJoined;
		this.monthWorkingInYear = monthWorkingInYear;
	}

	public String getEmployeeId(){
		return this.employeeId;
	}
	
	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;

			case 2:
			monthlySalary = 5000000;

			case 3:
			monthlySalary = 7000000;
		}	

		if (worker.getForeigner()) {
			monthlySalary = (int) (monthlySalary * 1.5);
		}
	}

	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}

	public int getAnnualDeductible() {	
		return this.annualDeductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

	public int getAnnualIncomeTax() {
		LocalDate date = LocalDate.now();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
		cal.setTime(dateJoined);

		if (date.getYear() == cal.get(Calendar.YEAR)) {
			monthWorkingInYear = date.getMonthValue() - cal.get(Calendar.MONTH);
		}else {
			monthWorkingInYear = 12;
		}
		baseSalary(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible);
		return TaxFunction.calculateTax();
	}
}
