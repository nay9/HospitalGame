package highhospital;

public class Patient {

	
	private int bloodLevel;
	private int healthLevel;
	private String patientName;
	
	public Patient(int bloodLevel, int healthLevel, String patientName) {
		this.patientName = patientName;
		this.bloodLevel = bloodLevel;
		this.healthLevel = healthLevel;
		
	}
	
	
	public String getPatientName() {
		// TODO Auto-generated method stub
		return patientName;
	}
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	public void curePatient() { 
		healthLevel =+ 5;
	}
	
}
