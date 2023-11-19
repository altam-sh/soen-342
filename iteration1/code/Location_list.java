import java.util.ArrayList;

public class Location_list extends Registry{
	
	ArrayList<Location> locations;
	
	Location L1 = new Location("montreal");
    Location L2 = new Location("quebec");
    Location L3 = new Location("toronto");
    Location L4 = new Location("vancouver");
    Location L5 = new Location("alberta");
    Location L6 = new Location("ottawa");
    Location L7 = new Location("laval");

	public Location_list() {
	    locations = new ArrayList<Location>();
	    locations.add(L1);
	    locations.add(L2);
	    locations.add(L3);
	    locations.add(L4);
	    locations.add(L5);
	    locations.add(L6);
	    locations.add(L7);
	}
	
	public void addLocation(String name) {
		locations.add(new Location(name));
	}
	
	public ArrayList<Location> getList() {
	       return locations;
	   }
	
}