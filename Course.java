package Marathon02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Course {
	
	private String courseName;
	private Teacher royalTeacher;
	private Teacher backUpTeacher;
	private HashMap<String,Student> studentList;
	private int studentCapacity;
	private int whichYear;
	private int weeklyHour;
	private DayOfWeek day;
	
	
	public Course(String courseName, Teacher royalTeacher, Teacher backUpTeacher,HashMap<String,Student> studentList,
			int studentCapacity,int whichYear, int weeklyHour, DayOfWeek day) {
		this.courseName    = courseName;
		this.royalTeacher  = royalTeacher;
		this.backUpTeacher = backUpTeacher;
		this.studentList   = studentList;
		this.studentCapacity = studentCapacity;
		this.whichYear     = whichYear;
		this.weeklyHour    = weeklyHour;
		this.day           = day;
	}

	public void createCourse(Course course) {
		if(course.getStudentList().size() > course.studentCapacity) {
			System.out.printf("Bu kursta en fazla {0} öðrenci olabilir" , course.getStudentCapacity());
		}
		
	}

	public String getCourseName() {
		return this.courseName;
	}


	public Teacher getRoyalTeacher() {
		return this.royalTeacher;
	}


	public Teacher getBackUpTeacher() {
		return this.backUpTeacher;
	}


	public HashMap<String,Student>	 getStudentList() {
		return this.studentList;
	}


	public int getWhichYear() {
		return this.whichYear;
	}


	public int getWeeklyHour() {
		return this.weeklyHour;
	}


	public DayOfWeek getDay() {
		return this.day;
	}

	public int getStudentCapacity() {
		return this.studentCapacity;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + this.courseName + ", royalTeacher=" + this.royalTeacher + ", backUpTeacher="
				+ this.backUpTeacher + ", studentList=" + this.studentList + ", studentCapacity=" + this.studentCapacity
				+ ", whichYear=" + this.whichYear + ", weeklyHour=" + this.weeklyHour + ", day=" + this.day + "]";
	}
	
	
	

}
