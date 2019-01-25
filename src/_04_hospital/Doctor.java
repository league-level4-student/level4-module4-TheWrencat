package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patList = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public Object makesHouseCalls() {
		return false;
	}

	// here!
	public List<Patient> getPatients() {
		return patList;
	}

	public void assignPatient(Patient p) throws DoctorFullException {
		if (patList.size() == 3) {
			throw new DoctorFullException();
		} else {
			patList.add(p);
		}

	}

	public void doMedicine() {
		for (int i = 0; i < patList.size(); i++) {
			patList.get(i).checkPulse();
		}
	}

}
