import java.util.ArrayList;

public class Registry {
	
	public static void main(String[] args) {
		
		Location_list lList = new Location_list();
		
		Sensor_list sList = new Sensor_list();
		
		Temperature_list tList = new Temperature_list();
		
		
		Map map = new Map();
		Read read = new Read();
		Message mes = new Message();
		
		Sensor s1 = sList.getList().get(0);
		Location l1 = lList.getList().get(0);
		Temperature t1 = tList.getList().get(0);

		//deploy a sensor -> should be okay
		System.out.print("\nDEBUGG: Let's try to deploy a sensor correctly.\n");
		DeploySensorOk(s1,l1,t1,map,read);

		//now testing to deploy the same sensor -> should give error message
		System.out.print("\nDEBUGG: Let's try to deploy the same sensor again.\n");
		DeploySensorOk(s1,l1,t1,map,read);

		//try to deploy a sensor to a location already covered -> should be wrong
		System.out.print("\nDEBUGG: Let's try to deploy a new sensor to a location that has already a sensor.\n");
		Sensor s2 = sList.getList().get(1);
		Temperature t2 = tList.getList().get(1);
		DeploySensorOk(s2,l1,t1,map,read);

		//try to deploy the same sensor to another location
		System.out.print("\nDEBUGG: Let's try to deploy the same sensor to a different location.\n");
		Temperature t3 = tList.getList().get(2);
		Location l2 = lList.getList().get(1);
		DeploySensorOk(s1,l2,t1,map,read);

		//now to show that all the sensors work we will print all of them
		System.out.print("\nDEBUGG: Now, let's deploy all the sensors to a location and read the temperature.\n");
		//sensor 2 already brought
		//location 2 already brought up
		//T2 already brought up
		DeploySensorOk(s2,l2,t2,map,read);
		System.out.print("Temperature at " + l2 + " is " + ReadTemperature(l2, map, read) + " degrees Celcius\n\n");

		Sensor s3 = sList.getList().get(2);
		Location l3 = lList.getList().get(2);
		//temperature T3 already defined above
		DeploySensorOk(s3,l3,t3,map,read);
		System.out.print("Temperature at " + l3 + " is " + ReadTemperature(l3, map, read) + " degrees Celcius\n\n");

		Sensor s4 = sList.getList().get(3);
		Location l4 = lList.getList().get(3);
		Temperature t4 = tList.getList().get(3);
		DeploySensorOk(s4,l4,t4,map,read);
		System.out.print("Temperature at " + l4 + " is " + ReadTemperature(l4, map, read) + " degrees Celcius\n\n");

		Sensor s5 = sList.getList().get(4);
		Location l5 = lList.getList().get(4);
		Temperature t5 = tList.getList().get(4);
		DeploySensorOk(s5,l5,t5,map,read);
		System.out.print("Temperature at " + l4 + " is " + ReadTemperature(l4, map, read) + " degrees Celcius\n\n");

		Sensor s6 = sList.getList().get(5);
		Location l6 = lList.getList().get(5);
		Temperature t6 = tList.getList().get(5);
		DeploySensorOk(s6,l6,t6,map,read);
		System.out.print("Temperature at " + l6 + " is " + ReadTemperature(l6, map, read) + " degrees Celcius\n\n");

		Sensor s7 = sList.getList().get(6);
		Location l7 = lList.getList().get(6);
		Temperature t7 = tList.getList().get(6);
		DeploySensorOk(s7,l7,t7,map,read);
		System.out.print("Temperature at " + l7 + " is " + ReadTemperature(l7, map, read) + " degrees Celcius\n\n");









		//now for location


	}
	public static void DeploySensorOk(Sensor sensor, Location location, Temperature temp, Map map, Read read) {
		
		ArrayList<Map_item> mapList = map.getMap();
		ArrayList<Read_item> readList = read.getRead();
		String loc = LocationCovered(location, map.getMap());
		Boolean deployed = sensor.getDeployed();
		Message mes = new Message();
		
		if (deployed == false && loc.equals(mes.location(false))) {
			sensor.setDeployed(true);
			mapList.add(new Map_item(sensor, location));
			readList.add(new Read_item(sensor, temp));
			System.out.print("Deployed correctly. Deployed sensor " + sensor.getSensorID() + " at " + location.getName() + "\n");
		}
		else {
			System.out.print("Failed to deploy sensor " + sensor.getSensorID() + " at location " + location.getName() + ".\n");
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
