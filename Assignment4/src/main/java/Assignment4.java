import javax.swing.*;

/**
 * main of Assignment4
 * Created by Mason Matlock on 6/25/2015.
 */
public class Assignment4 {
    public static void main(String[] args) {
        javaJava();
    }
    public static void javaJava() {
        final double COST_COFFEE = 1.00;
        final double COST_TEA = 1.00;
        final double COST_CAP = 2.99;
        final double COST_LAT = 2.40;
        final double WHOLE_CHARGE = 0.50;
        String menu, menuInner;
        boolean flag = true, inputCheck;

        do {
            menu = JOptionPane.showInputDialog(null, "Welcome to Java Java, \"Where Java gets you java!\"\n"
                    + "What would you like to purchase?\n"
                    + "1. Coffee\n"
                    + "2. Tea\n"
                    + "3. Cappuccino\n"
                    + "4. Latte");
            switch (menu) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Your coffee will cost $" + COST_COFFEE);
                    break;
                case "2":
                    do {
                        inputCheck = false;
                        menuInner = JOptionPane.showInputDialog(null, "Do you wish to use Skim or whole milk?\n1. Skim\n2. Whole");
                        switch (menuInner) {
                            case "1":
                                JOptionPane.showMessageDialog(null, "There will be no extra charge.");
                                JOptionPane.showMessageDialog(null, "Your tea will cost $" + COST_TEA);
                                inputCheck = true;
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, "There will be a 50 cent charge.");
                                JOptionPane.showMessageDialog(null, "Your tea will cost $" + (COST_TEA + WHOLE_CHARGE));
                                inputCheck = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid Input.");
                                break;
                        }
                    } while (!inputCheck);
                    break;
                case "3":
                    do {
                        inputCheck = false;
                        menuInner = JOptionPane.showInputDialog(null, "Do you wish to use Skim or whole milk?\n1. Skim\n2. Whole");
                        switch (menuInner) {
                            case "1":
                                JOptionPane.showMessageDialog(null, "There will be no extra charge.");
                                JOptionPane.showMessageDialog(null, "Your cappuccino will cost $" + COST_CAP);
                                inputCheck = true;
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, "There will be a 50 cent charge.");
                                JOptionPane.showMessageDialog(null, "Your cappuccino will cost $" + (COST_CAP + WHOLE_CHARGE));
                                inputCheck = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid Input.");
                                break;                        }
                    } while (!inputCheck);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Your latte will cost $" + COST_LAT);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.");
                    break;
            }
            do {
                inputCheck = false;
                menu = JOptionPane.showInputDialog(null, "Do you wish to purchase more items?");
                switch (menu) {
                    case "n":
                    case "no":
                    case "false":
                    case "f":
                    case "0":
                        flag = false;
                        inputCheck = true;
                        break;
                    case "y":
                    case "yes":
                    case "true":
                    case "t":
                        flag = true;
                        inputCheck = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
                        break;
                }
            } while (!inputCheck);
        } while (flag);
    }
}
