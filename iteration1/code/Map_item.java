public class Map_item {

    private Sensor s;
    private Location l;

    public Map_item(Sensor s, Location l) {
        this.s = s;
        this.l = l;
    }

    public Sensor getS() {
        return s;
    }

    public void setS(Sensor s) {
        this.s = s;
    }

    public Location getL() {
        return l;
    }

    public void setL(Location l) {
        this.l = l;
    }

	@Override
    public String toString() {
        return deployed;
    }
}