
public class Message extends Registry{
	private String response;
	private Boolean covered;
	
	public Message() {}
	

	public Boolean getCovered() {
		return covered;
	}

	public void setCovered(Boolean covered) {
		this.covered = covered;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	public String success() {
		response = "ok";
		return response;
	}
	
	public String sensor() {
		response = "Sensor deployed";
		return response;
	}
	
	public String location(Boolean covered) {
		response = "Location " + (covered ? "covered" : "not covered");
		return response;
	}
	
}
