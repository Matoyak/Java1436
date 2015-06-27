import javax.swing.*;

/**
 * Created by Matoyak on 6/25/2015.
 */
public class Assignment5 {
    public static void main(String[] args) {
        ticket();
    }

    public static void ticket() {
        final double BASE_PRICE = 10.00;
        final double DISCOUNT_CHILD = 0.30;
        final double DISCOUNT_ELD = 0.20;
        final double DISCOUNT_TIME = 0.20;
        double price = BASE_PRICE;
        double time;
        String age_s, time_s;
        int age;

        age_s = JOptionPane.showInputDialog(null, "What is your age?");
        age = Integer.parseInt(age_s);

        if (age < 12) {
            JOptionPane.showMessageDialog(null, DISCOUNT_CHILD * 100 + "% Discount");
            price -= price * DISCOUNT_CHILD;
        } else if (age >= 12 && age <= 65) {
            JOptionPane.showMessageDialog(null, "No discount.");
        } else if (age > 65) {
            JOptionPane.showMessageDialog(null, DISCOUNT_ELD * 100 + "% Discount");
            price -= price * DISCOUNT_ELD;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }

        time_s = JOptionPane.showInputDialog(null, "What time is it?\n(24h Clock, Decimal Format)\n"
                + "[ex: 1:30pm = 13.5 O'Clock]");
        time = Double.parseDouble(time_s);

        if (time >= 10.0 && time <= 14.0) { //is this supposed to be cumulative?
            JOptionPane.showMessageDialog(null, DISCOUNT_TIME * 100 + "% Discount");
            price -= price * DISCOUNT_TIME;
        } else {
            JOptionPane.showMessageDialog(null, "No discount.");
        }

        JOptionPane.showMessageDialog(null, "The final price is: $" + price);
    }
}
