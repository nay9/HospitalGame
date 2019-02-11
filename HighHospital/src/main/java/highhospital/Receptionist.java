package highhospital;

class Receptionist extends Employee {

	private int employeeSalary;
	private String jobTitle;

	public Receptionist(String humanName, int employeeId, int employeeSalary, String jobTitle) {
		super(humanName, employeeId);

		this.employeeSalary = 45000;
		this.jobTitle = "Receptionist";

	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

}