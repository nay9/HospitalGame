package highhospital;

public class Surgeon extends Medical {

	private int employeeSalary;
	private String jobTitle;

	public Surgeon(String humanName, int employeeId, boolean canDrawBlood, boolean canCareForPatients,
			int employeeSalary, String jobTitle) {
		super(humanName, employeeId, canDrawBlood, canCareForPatients);

		this.employeeSalary = 120000;
		this.jobTitle = "Surgeon";
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

}
