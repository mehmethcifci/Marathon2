package Marathon02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
	
	private Teacher teacher1;
	private Teacher teacher2;
	private Teacher teacher3;
	
	private List<Employee> employeeList;
	private HashMap<String, Course> courseList;
	private HashMap<String, Teacher> teacherList;
	private HashMap<String, Student> studentList;
	private HashMap<String, Double> salaryList;
	private List<Employee> oldEmployeeList = new ArrayList<>();

	public School() {
		this.employeeList = new ArrayList<>();
		this.teacherList = new HashMap<>();
		this.studentList = new HashMap<>();
		this.courseList = new HashMap<>();
		this.salaryList = new HashMap<>();
	}
	public void addEmployee() {
		
		Officer of1 = new Officer("Ýbrahim", "Hasan", "Akgün", "Male", false, LocalDate.of(1993, 6, 14), LocalDate.of(2015, 5, 5), null, 10000, "0555 555 5555", "0212 555 55 55");
		Officer of2 = new Officer("Ahmet", " ", "Güllü", "Male", false, LocalDate.of(1992, 4, 20), LocalDate.of(2016, 9, 15), null, 15000, "0555 555 5555", "0212 212 2112");
		Officer of3 = new Officer("Ali", " ", "Kartal", "Male", true, LocalDate.of(1992, 4, 20), LocalDate.of(2016, 9, 15), LocalDate.of(2020, 5, 6), 15000, "0555 555 5555", "0212 212 2112");
				
		teacher1 = new Teacher("Babür", " ", "Somer", "Male", true, LocalDate.of(1960, 5, 5), LocalDate.of(2022, 4, 11), null, 50000, "0530 288 9452", "0212 456 5785");
		teacher2 = new Teacher("Çaðrý", " ", "Türkmen", "Male", false, LocalDate.of(1992, 5, 25), LocalDate.of(2022, 4, 11), null, 25000, "0535 488 8785", "0212 212 3669");
		teacher3 = new Teacher("Selma", " ", "Cerrah", "Female", true, LocalDate.of(1960, 5, 25), LocalDate.of(2022, 4, 11), LocalDate.of(2019, 4, 5), 25000, "0535 488 8785", "0212 212 3669");
		
		Servant s1 = new Servant("Mehmet", "Mustafa", "Bektaþ", "Male", false, LocalDate.of(1992, 8, 25), LocalDate.of(2020, 5, 11), null, 10000, "0535 639 8720", "0212 547 3669");
		Servant s2 = new Servant("Özgür", "Enis", "Demirbaþ", "Male", false, LocalDate.of(1993, 12, 25), LocalDate.of(2019, 8, 11), null, 10000, "0555 879 1546", "0212 463 8545");
	
		employeeList.add(of1);
		of1.incresaSalary();
		salaryList.put(of1.getFirstName(), of1.getCurrentSalary());
		employeeList.add(of2);
		of2.incresaSalary();
		salaryList.put(of2.getFirstName(), of2.getCurrentSalary());
		employeeList.add(of3);
		of3.incresaSalary();
		salaryList.put(of3.getFirstName(), of3.getCurrentSalary());
		employeeList.add(teacher1);
		teacher1.incresaSalary();
		salaryList.put(teacher1.getFirstName(), teacher1.getCurrentSalary());
		employeeList.add(teacher2);
		teacher2.incresaSalary();
		salaryList.put(teacher2.getFirstName(), teacher2.getCurrentSalary());
		employeeList.add(teacher3);
		teacher3.incresaSalary();
		salaryList.put(teacher3.getFirstName(), teacher3.getCurrentSalary());
		employeeList.add(s1);
		s1.incresaSalary();
		salaryList.put(s1.getFirstName(), s1.getCurrentSalary());
		employeeList.add(s2);		
		s2.incresaSalary();
		salaryList.put(s2.getFirstName(), s2.getCurrentSalary());
	}
	public void addStudent() {
		
		Student st1 = new Student("Mehmet", "Hasan", "Çifçi", "Male", false, LocalDate.of(1993, 5, 14), LocalDate.of(2020, 12, 5), null, 1, "0555 587 5555", "0212 456 5555");
		Student st2 = new Student("Pýnar", " ", "Deniz", "Female", false, LocalDate.of(1990, 5, 14), LocalDate.of(2020, 12, 5), null, 1, "0545 546 5555", "0212 444 4444");
		Student st3 = new Student("Pýnar", " ", "Deniz", "Female", false, LocalDate.of(1990, 5, 14), LocalDate.of(2020, 12, 5), null, 1, "0545 546 5555", "0212 444 4444");
		
		studentList.put(st1.getSchoolNo(), st1);
		studentList.put(st2.getSchoolNo(), st2);
	}
	
	
	public void oldEmployeeList() {
		System.out.println("Eski Çalýþan Listesi:");
		
		for (Employee employee : employeeList) {
			if (employee.getFinishDate() != null) {
				oldEmployeeList.add(employee);
			} else {
			}
			
		}
		System.out.println(oldEmployeeList);
	}
	
	public void initMenu() {
		
		
		System.out.println("1-Yeni Çalýþan");
		System.out.println("2-Çalýþan Listeleme");
		System.out.println("3-Eski Çalýþan");
		System.out.println("4-Yeni Sýnýf");
		System.out.println("5-Öðrenci Atama");
		System.out.println("6-Sýnýf Listesi");
		System.out.println("7-Öðrenci Sýnýflarý");
		System.out.println("8-Hediye Listesi");
		System.out.println("9-Ücret Listesi");
		System.out.println("10-Çýkýþ");
		
		
	}
	
	public void createCourse() {
		
		Course course1 = new Course("Java FullStack", teacher1, teacher2, studentList,10 , 2022, 40, DayOfWeek.of(5));
		Course course2 = new Course(".NET FullStack", teacher1, teacher2, studentList,10 , 2022, 40, DayOfWeek.of(5));
		courseList.put(course1.getCourseName(), course1);
		courseList.put(course2.getCourseName(), course2);
	}
	
	
	public void showEmployeeList() {
		
		System.out.println(employeeList);
	}
	public void showCourseList() {
		
		System.out.println(courseList);
	}
	
	public void showSalaryList() {
		System.out.println(salaryList);
	}
}
