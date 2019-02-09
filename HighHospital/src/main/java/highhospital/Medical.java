package highhospital;

abstract class Medical extends Employee {
	
	private boolean canDrawBlood;
	private boolean canCareForPatients;

	public Medical(String employeeName, int employeeId, boolean canDrawBlood, boolean canCareForPatients) {
		
		super(employeeName, employeeId);
		
		this.canCareForPatients = true;
		this.canDrawBlood = true;		
		
	}
	public void drawBlood() {
		
	}
	
	public void administerCare() {
		
	}
	
} 