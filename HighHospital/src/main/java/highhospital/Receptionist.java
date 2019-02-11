package highhospital;

class Receptionist extends Employee {

	private int employeeSalary;
	private boolean isOnPhone;
	private String jobTitle;

	public Receptionist(String employeeName, int employeeId, int employeeSalary, boolean isOnPhone, String jobTitle) {
		super(employeeName, employeeId);

		this.employeeSalary = 45000;
		this.isOnPhone = isOnPhone;
		this.jobTitle = "Receptionist";

	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public boolean getIsOnPhone() {
		return isOnPhone;
	}
}