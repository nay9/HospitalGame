package highhospital;

import java.util.HashMap;

public class Hospital {
	private HashMap<String, Employee> employees = new HashMap<String, Employee>();

	public void addEmployee(Employee hospitalStaff) {
		employees.put(hospitalStaff.getEmployeeName(), hospitalStaff);
	}

	public void calculatePay() {
		System.out.println("Here is the payroll information:");
		System.out.println("Name \tID \tSalary");
		for (Employee employee : employees.values()) {
			if (employee instanceof Doctor) {
				System.out.println((((Doctor) employee).getEmployeeName()) + " \t"
						+ (((Doctor) employee).getEmployeeId()) + " \t" + (((Doctor) employee).getEmployeeSalary()));
			} else if (employee instanceof Surgeon) {
				System.out.println((((Surgeon) employee).getEmployeeName()) + "\t"
						+ (((Surgeon) employee).getEmployeeId()) + " \t" + (((Surgeon) employee).getEmployeeSalary()));
			} else if (employee instanceof Nurse) {
				System.out.println((((Nurse) employee).getEmployeeName()) + " \t" + (((Nurse) employee).getEmployeeId())
						+ " \t" + (((Nurse) employee).getEmployeeSalary()));
			} else if (employee instanceof Receptionist) {
				System.out.println((((Receptionist) employee).getEmployeeName()) + " \t"
						+ (((Receptionist) employee).getEmployeeId()) + " \t"
						+ (((Receptionist) employee).getEmployeeSalary()));
			} else if (employee instanceof Janitor) {
				System.out.println((((Janitor) employee).getEmployeeName()) + "\t"
						+ (((Janitor) employee).getEmployeeId()) + " \t" + (((Janitor) employee).getEmployeeSalary()));
			}
		}
		System.out.println("-----------------------------------------");
	}

//	public void allEmployeeId() {
//		for (Employee employee : employees.values()) {
//			System.out.println((employee).getEmployeeId());
//		}
//	}

	public void employeeList() {
		System.out.println("Here is a list of all employees");
		System.out.println("Title \t\tName \tID");
		for (Employee employee : employees.values()) {
			if (employee instanceof Doctor) {
				System.out.println((((Doctor) employee).getJobTitle()) + " \t\t"
						+ (((Doctor) employee).getEmployeeName()) + " \t" + (((Doctor) employee).getEmployeeId()));
			} else if (employee instanceof Surgeon) {
				System.out.println((((Surgeon) employee).getJobTitle()) + "\t\t"
						+ (((Surgeon) employee).getEmployeeName()) + "\t" + (((Surgeon) employee).getEmployeeId()));
			} else if (employee instanceof Nurse) {
				System.out.println((((Nurse) employee).getJobTitle()) + " \t\t" + (((Nurse) employee).getEmployeeName())
						+ " \t" + (((Nurse) employee).getEmployeeId()));
			} else if (employee instanceof Receptionist) {
				System.out.println((((Receptionist) employee).getJobTitle()) + " \t"
						+ (((Receptionist) employee).getEmployeeName()) + " \t"
						+ (((Receptionist) employee).getEmployeeId()));
			} else if (employee instanceof Janitor) {
				System.out.println((((Janitor) employee).getJobTitle()) + "\t\t"
						+ (((Janitor) employee).getEmployeeName()) + " \t" + (((Janitor) employee).getEmployeeId()));
			}
		}
		System.out.println("-----------------------------------------");
	}

	public void anyoneWhoCanDrawBlood() {
		System.out.println("Here is a list of all employees who can draw blood samples");
		System.out.println("Title \tName \tID");
		for (Employee employee : employees.values()) {
			if (employee instanceof Medical) {
				if (employee instanceof Doctor) {
					System.out.println((((Doctor) employee).getJobTitle()) + " \t"
							+ (((Doctor) employee).getEmployeeName()) + " \t" + (((Doctor) employee).getEmployeeId()));
				} else if (employee instanceof Surgeon) {
					System.out.println((((Surgeon) employee).getJobTitle()) + "\t"
							+ (((Surgeon) employee).getEmployeeName()) + "\t" + (((Surgeon) employee).getEmployeeId()));
				} else if (employee instanceof Nurse) {
					System.out.println((((Nurse) employee).getJobTitle()) + " \t"
							+ (((Nurse) employee).getEmployeeName()) + " \t" + (((Nurse) employee).getEmployeeId()));
//				} else if (employee instanceof Receptionist) {
//					System.out.println((((Receptionist) employee).getJobTitle()) + " \t"
//							+ (((Receptionist) employee).getEmployeeName()) + " \t"
//							+ (((Receptionist) employee).getEmployeeId()));
//				} else if (employee instanceof Janitor) {
//					System.out.println(
//							(((Janitor) employee).getJobTitle()) + "\t\t" + (((Janitor) employee).getEmployeeName())
//									+ " \t" + (((Janitor) employee).getEmployeeId()));
//				}
				}
			}
		}
		System.out.println("-----------------------------------------");
	}
}