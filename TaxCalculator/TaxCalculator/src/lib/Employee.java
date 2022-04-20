package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

public class Employee {
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
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public void setMonthlySalary(int grade) {
		switch(grade){
			case 1:
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
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
   
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
		cal.setTime(dateJoined);

		if (date.getYear() == cal.get(Calendar.YEAR)) {
			monthWorkingInYear = date.getMonthValue() - cal.get(Calendar.MONTH);
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, workerParent.getSpouseIdNumber().equals(""), workerParent.getChildIdNumber().size());
	}
}
