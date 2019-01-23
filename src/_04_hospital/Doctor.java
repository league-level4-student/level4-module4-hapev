package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		if (this instanceof Surgeon)
		return true;
		return false;
	}

	public boolean makesHouseCalls() {
		if (this instanceof GeneralPractitioner)
			return true;
			return false;

	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		if (patients.size()==3) {
		throw new DoctorFullException();
		}
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {

		return patients;
	}

	public void doMedicine() {

		for (Patient p: patients) {
			p.setCaredFor(true);
		}
	}

}
