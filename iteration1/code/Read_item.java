
public class Read_item {
	private Sensor sensor;
	private Temperature temp;
	
	public Read_item(Sensor sensor, Temperature temp) {
		this.sensor = sensor;
		this.temp = temp;
	}

	public Sensor getS() {
		return sensor;
	}

	public void setS(Sensor sensor) {
		this.sensor = sensor;
	}

	public Temperature getT() {
		return temp;
	}

	public void setT(Temperature temp) {
		this.temp = temp;
	}

	@Override
    public String toString() {
        return sensor.toString() + ", " + temp.toString();
    }

}
