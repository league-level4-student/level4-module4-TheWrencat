package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docList = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		docList.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public void assignPatientsToDoctors() {
		int docCount = 0;
		for (int i = 0; i < patients.size(); i++) {
			try {
				docList.get(docCount).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				i--;
				docCount++;
			}
		}
	}

	public List<Doctor> getDoctors() {
		return docList;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

}
