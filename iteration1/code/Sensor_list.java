import java.util.ArrayList;

public class Sensor_list extends Registry{

	ArrayList<Sensor> sensors;
	
	Sensor S1 = new Sensor("001", true);
    Sensor S2 = new Sensor("002", true);
    Sensor S3 = new Sensor("003", false);
    Sensor S4 = new Sensor("004", true);
    Sensor S5 = new Sensor("005", true);
    Sensor S6 = new Sensor("006", false);
    Sensor S7 = new Sensor("008", false);
    Sensor S8 = new Sensor("009", false);
    Sensor S9 = new Sensor("010", true);
    Sensor S10 = new Sensor("011", false);
    Sensor S11 = new Sensor("012", true);


	public Sensor_list() {
	    sensors = new ArrayList<Sensor>();
	    sensors.add(S1);
	    sensors.add(S2);
	    sensors.add(S3);
	    sensors.add(S4);
	    sensors.add(S5);
	    sensors.add(S6);
	    sensors.add(S7);
	    sensors.add(S8);
	    sensors.add(S9);
	    sensors.add(S10);
	    sensors.add(S11);

	    
	}
	
	public void addSensor(String sensorID, Boolean deployed) {
		sensors.add(new Sensor(sensorID, deployed));
	}
	
	public ArrayList<Sensor> getList() {
	       return sensors;
	}

}
