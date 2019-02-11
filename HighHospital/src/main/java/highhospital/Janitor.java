package highhospital;

public class Janitor extends Employee {

	private String jobTitle;
	private int employeeSalary;
	private boolean isSweeping;
	public Janitor(String employeeName, int employeeId, int employeeSalary, String jobTitle, boolean isSweeping) {
		super(employeeName, employeeId);
		this.employeeSalary = 40000;
		this.jobTitle = "Janitor";
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public boolean getIsSweeping() {
		return isSweeping;
	}

}
