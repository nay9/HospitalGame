package highhospital;

class Doctor extends Medical {
	private int employeeSalary;
	private String jobTitle;

	public Doctor(String humanName, int employeeId, boolean canDrawBlood, boolean canCareForPatients,
			int employeeSalary, String jobTitle) {
		super(humanName, employeeId, canDrawBlood, canCareForPatients);

		this.employeeSalary = 90000;
		this.jobTitle = "Doctor";

	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

}
