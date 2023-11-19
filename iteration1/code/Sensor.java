
public class Sensor{
	
	private String sensorID;
	private Boolean deployed;
	
	public Sensor(String sensorID, Boolean deployed) {
		this.sensorID = sensorID;
		this.deployed = deployed;
	}
	
	public Boolean getDeployed() {
		return deployed;
	}


	public void setDeployed(Boolean deployed) {
		this.deployed = deployed;
	}


	public String getSensorID() {
		return sensorID;
	}


	public void setSensorID(String sensorID) {
		this.sensorID = sensorID;
	}
	
	@Override
    public String toString() {
        return sensorID + ", Deployed: " + (deployed ? "Yes" : "No");
    }
}
