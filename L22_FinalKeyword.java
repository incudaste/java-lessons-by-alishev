package lessons;

class L22_FinalKeyword {

	public static void main(String[] args) {
		Processor intel = new Processor();

		intel.setCurrentTemperature(63);
		System.out.println("Intel CPU temperature: " + intel.getCurrentTemperature() + "\u00b0C");

		intel.setOverheatingStatus();
		intel.getOverheatingStatus();

		Processor amd = new Processor();

		amd.setCurrentTemperature(91);
		System.out.println("\nAMD CPU temperature: " + amd.getCurrentTemperature() + "\u00b0C");

		amd.setOverheatingStatus();
		amd.getOverheatingStatus();
	}
}

class Processor {

	private int currentTemperature;

	public void setCurrentTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	public int getCurrentTemperature() {
		return currentTemperature;
	}

	private static final byte MAX_TEMPERATURE_WITHOUT_OVERHEATING = 90;

	private boolean overheatingStatus;

	public void setOverheatingStatus() {
		overheatingStatus = currentTemperature > MAX_TEMPERATURE_WITHOUT_OVERHEATING;
	}

	public void getOverheatingStatus() {
		if (overheatingStatus == false) {
			System.out.println("Alright! No overheating.");
		} else {
			System.out.println("Warning! Overheating detected!");
		}
	}
}