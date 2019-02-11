package highhospital;

import java.util.HashMap;

public class HospitalMethods {
	private HashMap<String, Human> humans = new HashMap<String, Human>();

	public void addHuman(Human hospitalStaff) {
		humans.put(hospitalStaff.getHumanName(), hospitalStaff);
	}

	private int tick = 0;

	public void calculatePay() {
		System.out.println("Here is the payroll information:");
		System.out.println("Name \tID \tSalary");
		for (Human human : humans.values()) {
			if (human instanceof Doctor) {
				System.out.println((((Doctor) human).getHumanName()) + " \t" + (((Doctor) human).getEmployeeId())
						+ " \t" + (((Doctor) human).getEmployeeSalary()));
			} else if (human instanceof Surgeon) {
				System.out.println((((Surgeon) human).getHumanName()) + "\t" + (((Surgeon) human).getEmployeeId())
						+ " \t" + (((Surgeon) human).getEmployeeSalary()));
			} else if (human instanceof Nurse) {
				System.out.println((((Nurse) human).getHumanName()) + " \t" + (((Nurse) human).getEmployeeId()) + " \t"
						+ (((Nurse) human).getEmployeeSalary()));
			} else if (human instanceof Receptionist) {
				System.out.println(
						(((Receptionist) human).getHumanName()) + " \t" + (((Receptionist) human).getEmployeeId())
								+ " \t" + (((Receptionist) human).getEmployeeSalary()));
			} else if (human instanceof Janitor) {
				System.out.println((((Janitor) human).getHumanName()) + "\t" + (((Janitor) human).getEmployeeId())
						+ " \t" + (((Janitor) human).getEmployeeSalary()));
			}
		}
		System.out.println("-----------------------------------------");
	}

//	public void allEmployeeId() {
//		for (Employee human : humans.values()) {
//			System.out.println((human).getEmployeeId());
//		}
//	}

	public void employeeList() {
		System.out.println("Here is a list of all employees");
		System.out.println("Title \t\tName \tID");
		for (Human human : humans.values()) {
			if (human instanceof Doctor) {
				System.out.println((((Doctor) human).getJobTitle()) + " \t\t" + (((Doctor) human).getHumanName())
						+ " \t" + (((Doctor) human).getEmployeeId()));
			} else if (human instanceof Surgeon) {
				System.out.println((((Surgeon) human).getJobTitle()) + "\t\t" + (((Surgeon) human).getHumanName())
						+ "\t" + (((Surgeon) human).getEmployeeId()));
			} else if (human instanceof Nurse) {
				System.out.println((((Nurse) human).getJobTitle()) + " \t\t" + (((Nurse) human).getHumanName()) + " \t"
						+ (((Nurse) human).getEmployeeId()));
			} else if (human instanceof Receptionist) {
				System.out.println((((Receptionist) human).getJobTitle()) + " \t"
						+ (((Receptionist) human).getHumanName()) + " \t" + (((Receptionist) human).getEmployeeId()));
			} else if (human instanceof Janitor) {
				System.out.println((((Janitor) human).getJobTitle()) + "\t\t" + (((Janitor) human).getHumanName())
						+ " \t" + (((Janitor) human).getEmployeeId()));
			}
		}
		System.out.println("-----------------------------------------");
	}

	public void anyoneWhoCanDrawBlood() {
		System.out.println("Here is a list of all employees who can draw blood samples");
		System.out.println("Title \tName \tID");
		for (Human human : humans.values()) {
			if (human instanceof Medical) {
				if (human instanceof Doctor) {
					System.out.println((((Doctor) human).getJobTitle()) + " \t" + (((Doctor) human).getHumanName())
							+ " \t" + (((Doctor) human).getEmployeeId()));
				} else if (human instanceof Surgeon) {
					System.out.println((((Surgeon) human).getJobTitle()) + "\t" + (((Surgeon) human).getHumanName())
							+ "\t" + (((Surgeon) human).getEmployeeId()));
				} else if (human instanceof Nurse) {
					System.out.println((((Nurse) human).getJobTitle()) + " \t" + (((Nurse) human).getHumanName())
							+ " \t" + (((Nurse) human).getEmployeeId()));
				} else if (human instanceof Receptionist) {
//			
				}
			}
		}
		System.out.println("-----------------------------------------");
	}

	public void nurseList() {
		System.out.println("Here is a list of all nurses");
		System.out.println("Title \tName \tID");
		for (Human human : humans.values()) {
			if (human instanceof Nurse) {
				System.out.println((((Nurse) human).getJobTitle()) + " \t" + (((Nurse) human).getHumanName()) + " \t"
						+ (((Nurse) human).getEmployeeId()));
			}
		}
	}

	public void patientList() {
		System.out.println("Here is a list of all patients");
		System.out.println("Name \tHealth Level \tBlood Level");
		for (Human human : humans.values()) {
			if (human instanceof Patient)
				System.out.println(((Patient) human).getHumanName() + "\t" + ((Patient) human).getHealthLevel() + "\t\t"
						+ ((Patient) human).getBloodLevel());
		}
		System.out.println("-----------------------------------------");
	}

	public void cureAllPatients() {
		for (Human human : humans.values()) {
			if (human instanceof Patient)
				((Patient) human).curePatients();
		}
	}

	public void selectPatientToCure() {
		for (Human human : humans.values()) {
			if (human instanceof Patient)
				((Patient) human).cureOnePatient();
		}
	}

	public Human getHuman(String selectedHuman) {
		return humans.get(selectedHuman);
	}

	public void incrementHospitalMethods() {
		tick++;
		for (Human human : humans.values()) {
			if (tick % 7 == 0) {
				if (human instanceof Patient) {
					((Patient) human).healthLevelDecrement();
				}
			}
			if (tick % 20 == 0) {
				if (human instanceof Patient) {
					((Patient) human).bloodLevelIncrement();
				}

			}
			if (human instanceof Patient) {
				if (((Patient) human).getHealthLevel() < 3) {
					System.out.println("Patient " + ((Patient) human).getHumanName()
							+ " is dying, \nyou should think about performing surgery.");
					System.out.println("Blood Level: " + ((Patient) human).getBloodLevel() + "\nHealth Level: "
							+ ((Patient) human).getHealthLevel());
				}
				if (((Patient) human).getBloodLevel() < 6) {
					System.out.println(
							"Patient " + ((Patient) human).getHumanName() + " has had too many blood samples taken.");
					System.out.println("Blood Level: " + ((Patient) human).getBloodLevel() + "\nHealth Level: "
							+ ((Patient) human).getHealthLevel());
				}
			}
			callDeath();
		}
	}

	public void takeBloodSamples() {
		for (Human human : humans.values()) {
			if (human instanceof Patient) {
				((Patient) human).bloodSamples();

			}
		}
	}

	public void performSurgery() {
		for (Human human : humans.values()) {
			if (human instanceof Patient) {
				((Patient) human).riskySurgery();
			}
		}

	}

	public void callDeath() {
		for (Human human : humans.values()) {
			if (human instanceof Patient) {
				if (((Patient) human).getHealthLevel() <= 0 || ((Patient) human).getBloodLevel() <= 0) {
					System.out.println("Patient " + ((Patient) human).getHumanName() + " has died.\nGame Over");
					System.exit(0);
					;
				}
			}
		}
	}

}