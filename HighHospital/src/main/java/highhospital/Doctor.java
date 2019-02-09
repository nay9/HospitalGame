package highhospital;



class Doctor extends Medical {


	private int employeeSalary;
	private String jobTitle;
	public Doctor(String employeeName, int employeeId,  boolean canDrawBlood,
			boolean canCareForPatients, int employeeSalary, String jobTitle) {
		super(employeeName, employeeId, canDrawBlood, canCareForPatients);
		
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
	


