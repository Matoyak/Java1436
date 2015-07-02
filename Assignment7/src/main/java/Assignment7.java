import javax.swing.*;

/**
 * PACKAGE_NAME of Assignment7
 * Created by Mason Matlock on 7/1/2015.
 */
public class Assignment7 {
    public static void main(String[] args) {
        dLoop();
        fLoop();
    }

    static void dLoop() {
        boolean flag = true;
        String choice;
        do {
            choice = JOptionPane.showInputDialog(null, "1. I love this menu!\n"
                + "2. I hate this menu.");
            switch (choice) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Hooray!");
                break;
                case "2":
                    JOptionPane.showMessageDialog(null, "I see how it is.");
                    flag = false;
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Wait, what was that you said?");
            }
        } while (flag);
    }

    static void fLoop() {
        int sum = 0;
        double mean;
        for (int i = 1; i<=100; ++i) {
            sum += i;
        }
        mean = (double)sum / 100;
        JOptionPane.showMessageDialog(null, "The sum of 1 through 100 is " + sum);
        JOptionPane.showMessageDialog(null, "The mean of 1 through 100 is " + mean);
    }
}
