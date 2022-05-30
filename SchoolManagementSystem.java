package Marathon02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

	public class SchoolManagementSystem {

	public static void main(String[] args) {
		int selection;
		boolean exit = false;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		School school = new School();
		
		while(exit!=true) {
		school.initMenu();
		System.out.println("Yapmak istediðiz iþlemi seçiniz");
		selection= scan.nextInt();
		switch(selection) {
		
			case 1:
				school.addEmployee();
				break;
			
			case 2:
				school.showEmployeeList();
				break;
				
			case 3:
				school.oldEmployeeList();
				break;
		
			case 4:
				school.createCourse();
				break;
				
			case 5:
				school.addStudent();
				break;	
				
			case 6:
				school.showCourseList();
				break;
			
			case 7:
				
				break;
			
			case 8:
				//school.giftList();
				break;	
				
			case 9:
				
				break;
				
			case 10:
				
				System.out.println("Çýkýþ yapmak istediðinize emin misiniz?(evet/hayýr)");
				String sure = scan2.nextLine();
				if(sure.equalsIgnoreCase("evet")) {
					System.out.println("Baþarýyla çýkýþ yaptýnýz...");
					exit=true;
					break;
				}
				else {
					break;
				}
			
				
		}
		
		
		
		

	}}

}
