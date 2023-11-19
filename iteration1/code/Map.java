import java.util.ArrayList;

public class Map extends Registry{
    ArrayList<Map_item> map;


    Map(){
        this.map = new ArrayList<Map_item>;
        //add default maps in the registry since registry can only see both sensor and map
    }
    public void CreateMap_item(Sensor sensor, Location location) {

        Map.add(new Map_item(sensor, location));
    }
    public ArrayList<Map_item> getMap(){
        return Map;
    }
}