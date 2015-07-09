import javax.swing.*;

/**
 * PACKAGE_NAME of Assignment8
 * Created by Mason Matlock on 7/9/2015.
 */
public class Assignment8 {
    public static void main(String[] args) {
        askName();
        String schoolName = JOptionPane.showInputDialog("What is the school's name?");
        String yearBuilt_s = JOptionPane.showInputDialog("When was the school built?");
        int yearBuilt = Integer.parseInt(yearBuilt_s);
        school(schoolName, yearBuilt);
        String carModel = JOptionPane.showInputDialog("What is the model of car?");
        String yearCarBuilt_s = JOptionPane.showInputDialog("When was the car built?");
        int yearCarBuilt = Integer.parseInt(yearCarBuilt_s);
        String message = car(carModel,yearCarBuilt);
        JOptionPane.showMessageDialog(null, message);
    }

    public static void askName() {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name + ".");
    }

    public static void school(String name, int year) {
        String curYear_s = JOptionPane.showInputDialog("What year is it?");
        int curYear = Integer.parseInt(curYear_s);
        int age = curYear - year;
        JOptionPane.showMessageDialog(null, name + " has been open for " + age + " years.");
    }

    /**
        @return Gives the message about age of car.
     */
    public static String car(String model, int year) {
        String message;
        if (year > 2000) {
            message = "The " + model + " is not that old.";
        } else if (year < 2000) {
            message = "The " + model + " is pretty old.";
        } else {
            message = "The " + model + " is between old and not old.";
        }
        return message;
    }
}
