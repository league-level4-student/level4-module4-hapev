package _04_hospital;

public class Patient {
	private boolean caredFor = false;
	public void checkPulse() {
		caredFor = true;
	}

	public boolean feelsCaredFor() {
		if (caredFor)
		return true;
		return false;
	}


	public void setCaredFor(boolean caredFor) {
		this.caredFor = caredFor;
	}
	

}
