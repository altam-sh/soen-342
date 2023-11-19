import java.util.ArrayList;

public class Temperature_list extends Registry {

    ArrayList<Temperature> temperatures;

    Temperature T1 = new Temperature(0.0);
    Temperature T2 = new Temperature(14.0);
    Temperature T3 = new Temperature(8.0);
    Temperature T4= new Temperature(29.3);
    Temperature T5 = new Temperature(-20.45);
    Temperature T6 = new Temperature(-2.174329);
    Temperature T7 = new Temperature(9.0);
    Temperature T8 = new Temperature(4.0);
    Temperature T9 = new Temperature(2.90);
    Temperature T10 = new Temperature(-10.002);
    Temperature T11 = new Temperature(35.20);


    public Temperature_list() {
        temperatures = new ArrayList<Temperature>();
        temperatures.add(T1);
        temperatures.add(T2);
        temperatures.add(T3);
        temperatures.add(T4);
        temperatures.add(T5);
        temperatures.add(T6);
        temperatures.add(T7);
        temperatures.add(T8);
        temperatures.add(T9);
        temperatures.add(T10);
        temperatures.add(T11);
    }

    public void addTemperature(double temp) {
        temperatures.add(new Temperature(temp));
    }

    public ArrayList<Temperature> getList() {
        return temperatures;
    }
}
