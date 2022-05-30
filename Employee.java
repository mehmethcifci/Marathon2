package Marathon02;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private boolean isMarried;
	private LocalDate birthDate;
	private LocalDate startDate;
	private LocalDate finishDate;
	private double firstSalary;
	private double currentSalary;
	private String mobile;
	private String telNo;
	private LocalDate salaryUpdateDate;
	
	public Employee(String firstName, String middleName, String lastName, String gender, boolean isMarried,
			LocalDate birthDate, LocalDate startDate, LocalDate finishDate, double firstSalary, String mobile,
			String telNo) {
		this.firstName   = firstName;
		this.middleName  = middleName;
		this.lastName    = lastName;
		this.gender      = gender;
		this.isMarried   = isMarried;
		this.birthDate   = birthDate;
		this.startDate   = startDate;
		this.finishDate  = finishDate;
		this.firstSalary = firstSalary;
		this.mobile      = mobile;
		this.telNo       = telNo;
		this.salaryUpdateDate = LocalDate.now();
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getGender() {
		return this.gender;
	}

	public boolean isMarried() {
		return this.isMarried;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public LocalDate getFinishDate() {
		return this.finishDate;
	}

	public double getFirstSalary() {
		return this.firstSalary;
	}

	public String getMobile() {
		return this.mobile;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
	public LocalDate getSalaryUpdateDate() {
		return this.salaryUpdateDate;
	}
	

	public double getCurrentSalary() {
		return this.currentSalary;
	}
	

	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

	public abstract void incresaSalary();
	
	public void getDateInformationOfOldEmployees() {
		
		if(this.getFinishDate()!=null) {
		LocalDate startDate = this.getStartDate();
	    LocalDate finishDate = this.getFinishDate();
	 
	    Period intervalPeriod = Period.between(startDate, finishDate);
	 
	    System.out.println("Difference of days: " + intervalPeriod.getDays());
	    System.out.println("Difference of months: " + intervalPeriod.getMonths());
	    System.out.println("Difference of years: " + intervalPeriod.getYears());
		}
		else {}
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName="
				+ this.lastName + ", gender=" + this.gender + ", isMarried=" + this.isMarried + ", birthDate="
				+ this.birthDate + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate
				+ ", firstSalary=" + this.firstSalary + ", mobile=" + this.mobile + ", telNo=" + this.telNo + "]";
	}
	
	
}
