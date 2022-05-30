package Marathon02;

import java.time.LocalDate;
import java.time.Period;

public class Teacher extends Employee {
	private String registryNo;
	private int counter = 0;

	public Teacher(String firstName, String middleName, String lastName, String gender, boolean isMarried,
			LocalDate birthDate, LocalDate startDate, LocalDate finishDate, double firstSalary, String mobile,
			String telNo) {
		super(firstName, middleName, lastName, gender, isMarried, birthDate, startDate, finishDate, firstSalary, mobile, telNo);
		this.registryNo = this.generateID();
	}

	
	public  String generateID() {
		String num = String.format("%03d", ++counter);
		return "T-" + num;
		
		
	}


	@Override
	public String toString() {
		return "Teacher [registryNo=" + this.registryNo + ", FirstName=" + this.getFirstName()
				+ ", MiddleName=" + this.getMiddleName() + ", LastName=" + this.getLastName()
				+ ", Gender=" + this.getGender() + ", isMarried=" + this.isMarried() + ", BirthDate="
				+ this.getBirthDate() + ", StartDate=" + this.getStartDate() + ", FinishDate="
				+ this.getFinishDate() + ", FirstSalary=" + this.getFirstSalary() + ", Mobile="
				+ this.getMobile() + ", TelNo=" + this.getTelNo() + "]";
	}


	@Override
	public void incresaSalary() {
		LocalDate dateFrom = this.getSalaryUpdateDate();
	    LocalDate dateTo = LocalDate.now();
	 
	    Period intervalPeriod = Period.between(dateFrom, dateTo);
	 
	    if(intervalPeriod.getMonths()>=6) {
	    	this.setCurrentSalary(this.getCurrentSalary()*(1.10));
	    }
	}
}
