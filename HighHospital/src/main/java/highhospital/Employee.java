package highhospital;

import java.util.Random;

public abstract class Employee {
	Random employeeIdnumber = new Random();
		private String employeeName;
		private int employeeId;


		public Employee(String employeeName, int employeeId) {

			this.employeeName = employeeName;
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public int getEmployeeId() {
			if(employeeId == 0) {
				this.employeeId = employeeIdnumber.nextInt(1000);
		}
			return employeeId;
		}
		public void incrementStatus() {
			return;

		}
		
}



