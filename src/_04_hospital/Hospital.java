package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);
		
	}

	public void addPatient(Patient patient) {
		patientList.add(patient);
		
	}

	public ArrayList<Doctor> getDoctors() {

		return doctorList;
	}

	public ArrayList<Patient> getPatients() {
		
		return patientList;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int amountOfP = 0;
		for (int i = 0;i<doctorList.size();i++) {
			for (int p = 0;p<3;p++) {
				if (amountOfP<patientList.size()) {
				try {
					doctorList.get(i).assignPatient(patientList.get(amountOfP));
					amountOfP++;
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
			System.out.println(doctorList.get(i).getPatients().toString());
			
		}
		
	
	

}
}
