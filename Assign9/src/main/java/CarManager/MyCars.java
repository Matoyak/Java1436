package CarManager;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mason Worrell on 7/15/2015.
 */
public class MyCars {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car();
        Car car2 = new Car("Dodge","Mustang");
        display(cars);
    }

    public static void display(List<Car> cars) {
        for (Car c : cars) {
            JOptionPane.showMessageDialog(null, "Make: " + c.getMake() + "\nModel: " + c.getModel());
        }
    }
}
