
public class Temperature extends Temperature_List {
    private Double temp;

    public Temperature(Double temp) {
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return temp.toString();
    }


}
