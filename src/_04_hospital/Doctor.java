package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		return false;
	}
	
	public Object makesHouseCalls() {
		return false;
	}
	//here!
	public List<Patient> getPatients() {
		return patients;
	}
	
	public void assignPatient(Patient patient) {
		patients.add(patient);
		
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}


}
