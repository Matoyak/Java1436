package CarManager;

/**
 * Created by Mason Worrell on 7/15/2015.
 */
public class Car {
    private String make;
    private String model;

    public Car() {
        make = "Kia";
        model = "Sportage";
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() { return make; }

    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }
}
