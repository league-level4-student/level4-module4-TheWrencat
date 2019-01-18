package _04_hospital;

public class Patient {
	boolean cared = false;

	public Object feelsCaredFor() {
		return cared;
	}

	public void checkPulse() {
		cared = true;
	}

}
