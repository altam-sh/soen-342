import java.util.ArrayList;

public class Registry {
	
	public static void main(String[] args) {
		
		Location_list lList = new Location_list();
		
		Sensor_list sList = new Sensor_list();
		
		Temperature_list tList = new Temperature_list();
		
		
		Map map = new Map();
		Read read = new Read();
		Message mes = new Message();
		
		Sensor s1 = sList.getList().get(2);
		Location l1 = lList.getList().get(0);
		Temperature t1 = tList.getList().get(4);
		
		DeploySensorOk(s1,l1,t1,map,read);
		
		ReadTemperature(l1,map,read);
		
		System.out.println(ReadTemperature(l1,map,read));
		int keepTrack = 0;
		for (int i = 0 ; i < sList.sensors.size(); i++){
			if (sList.sensors.get(i).getDeployed() == true){
				map.CreateMap_item(sList.sensors.get(i), lList.locations.get(keepTrack));
				keepTrack++;
			}
		}
	}
	
	
	public static void DeploySensorOk(Sensor sensor, Location location, Temperature temp, Map map, Read read) {
		
		ArrayList<Map_item> mapList = map.getMap();
		ArrayList<Read_item> readList = read.getRead();
		String loc = LocationCovered(location, map.getMap());
		Boolean deployed = sensor.getDeployed();
		Message mes = new Message();
		
		if (deployed == false && loc.equals(mes.location(false))) {
			sensor.setDeployed(!deployed);
			mapList.add(new Map_item(sensor, location));
			readList.add(new Read_item(sensor, temp));
			
		}
		
		
	}
	
	public static Temperature ReadTemperature(Location location, Map map, Read read) {
		Sensor s = null;
		Temperature t = null;
		ArrayList<Map_item> mapList = map.getMap();
		ArrayList<Read_item> readList = read.getRead();
		
		for (Map_item mapItem : mapList) {
	        if (mapItem.getL().equals(location)) {
	           s = mapItem.getS(); 
	        }
	    }
		
		for (Read_item readItem : readList) {
			if (readItem.getS().equals(s)) {
				t = readItem.getT();
			}
		}
		
		return t;
		
	}
	
	public static String Success(Message mes) {
		return mes.success();
	}
	
	public static String SensorAlreadyDeployed(Sensor sensor) {
		Message mes = new Message();
	
		if (sensor.getDeployed() == true) 
			return mes.sensor();
		
		return "";
	}
	
	public static String LocationCovered(Location location, ArrayList<Map_item> map) {
		Boolean covered = false;
		Message mes = new Message();
        for (Map_item mapItem : map) {
            if (mapItem.getL().equals(location)) {
                covered = true;
            }
        }
        return mes.location(covered);
    }
	
	

}
