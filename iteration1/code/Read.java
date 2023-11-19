import java.util.ArrayList;

public class Read extends Registry{
	
	ArrayList<Read_item> Read;
	
	public Read() {
		Read = new ArrayList<Read_item>();
	}
	
	public void CreateRead_item(Sensor sensor, Temperature temp) {
		Read.add(new Read_item(sensor, temp));
	}
	
	public ArrayList<Read_item> getRead() {
		return Read;
	}
	

}
