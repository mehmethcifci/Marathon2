package Marathon02;

import java.time.LocalDate;

public class Student {
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private boolean isMarried;
	private LocalDate birthDate;
	private LocalDate startDate;
	private LocalDate finishDate;
	private int grade;
	private String mobile;
	private String telNo;
	private String schoolNo;
	private int counter = 0;
	
	
	public Student(String firstName, String middleName, String lastName, String gender, boolean isMarried,
			LocalDate birthDate, LocalDate startDate, LocalDate finishDate, int grade, String mobile, String telNo) {
		this.firstName  = firstName;
		this.middleName = middleName;
		this.lastName   = lastName;
		this.gender     = gender;
		this.isMarried  = false;
		this.birthDate  = birthDate;
		this.startDate  = startDate;
		this.finishDate = finishDate;
		this.grade      = grade;
		this.mobile     = mobile;
		this.telNo      = telNo;
		this.schoolNo   =this.generateID();
	}
	
	public  String generateID() {
		String num = String.format("%03d", ++counter);
		return "2022-" + num;	
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

	public int getGrade() {
		return this.grade;
	}

	public String getMobile() {
		return this.mobile;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public String getSchoolNo() {
		return this.schoolNo;
	}

	public int getCounter() {
		return this.counter;
	}

	@Override
	public String toString() {
		return "Student [schoolNo=" + this.schoolNo + ", firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName="
				+ this.lastName + ", gender=" + this.gender + ", isMarried=" + this.isMarried + ", birthDate="
				+ this.birthDate + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate + ", grade="
				+ this.grade + ", mobile=" + this.mobile + ", telNo=" + this.telNo + "]";
	}
	
	

	
	
}
