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
        boolean flag = true;
        do {
            String make = JOptionPane.showInputDialog("What is the make of your car?");
            String model = JOptionPane.showInputDialog("What model of car do you own?");
            Car car = new Car(make,model);
            cars.add(car);
            int confirm = JOptionPane.showConfirmDialog(null, "Do you wish to add more cars?");
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                flag = false;
            }
        }while(flag);
        display(cars);
    }

    public static void display(List<Car> cars) {
        for (Car c : cars) {
            JOptionPane.showMessageDialog(null, "Make: " + c.getMake() + "\nModel: " + c.getModel());
        }
    }
}
