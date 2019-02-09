package highhospital;

import java.util.Scanner;

public class Application {
	public static Scanner userInput = new Scanner(System.in);
	public static  Hospital virtualHospital = new Hospital();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Doctor("Heimer", 0, true, true, 0, null);
		Employee employee2 = new Surgeon("Schmidt", 0, true, true, 0, null);
		Employee employee3 = new Nurse("John", 0, true, true, 0, null);
		Employee employee4 = new Receptionist("Jacob", 0, 0, false, null);
		Employee employee5 = new Janitor("Jingle", 0, 0, null);
		
		virtualHospital.addEmployee(employee1);
		virtualHospital.addEmployee(employee2);
		virtualHospital.addEmployee(employee3);
		virtualHospital.addEmployee(employee4);
		virtualHospital.addEmployee(employee5);

		
	
	System.out.println("*****************************************");
	System.out.println("Welcome To The Hospital Management System");
	System.out.println("*****************************************");

	System.out.println("\tEnter 1 to Start The Game");
	System.out.println("*****************************************");
	int userMenuChoice = userInput.nextInt();
	userInput.nextLine();

	while (userMenuChoice != 9) {
		
	
		System.out.println("What would you like to do?");
		System.out.println("*****************************************");
		System.out.println("1. View List Of Employees");
		System.out.println("2. View Payroll Information");
		System.out.println("3. View Who Can Take A Blood Sample");
		System.out.println("4. Check The Status Of The Patients");
		System.out.println("5. Enter Task Menu");
		System.out.println("9. Exit");
		System.out.println("-----------------------------------------");
		userMenuChoice = userInput.nextInt();
		userInput.nextLine();

		switch (userMenuChoice) {

		case 1: 
			virtualHospital.employeeList();
			break;
		case 2:
			virtualHospital.calculatePay();
			break;
		case 3:
			virtualHospital.anyoneWhoCanDrawBlood();
			break;
		case 4:
			break;
		case 5:
			String userMenuChoice1 = userInput.nextLine();
			while (!userMenuChoice1.equals("9")) {

					userMenuChoice1 = userInput.nextLine();
					switch (userMenuChoice1) {
					case "1":
						break;
						}
					}
				}

			}
	

	System.out.println("\t Application Closed");
	System.out.println("\t     Goodbye.");
		}
}// close main method
