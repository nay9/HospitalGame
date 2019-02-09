package highhospital;

public class Nurse extends Medical {

	private int employeeSalary;
	private String jobTitle;
	public Nurse(String employeeName, int employeeId,  boolean canDrawBlood,
			boolean canCareForPatients, int employeeSalary, String jobTitle) {
		super(employeeName, employeeId, canDrawBlood, canCareForPatients);
		
		this.employeeSalary = 50000;
		this.jobTitle = "Nurse";
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	
	
	

}
