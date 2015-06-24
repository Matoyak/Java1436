import javax.swing.*;

/**
 * Created by Mason Matlock on 6/24/2015.
 */
public class Project1 {
    public static void main(String[] args) {
        final double PRICE_BOOK = 2.23;
        final double PRICE_PEN = 0.27;
        final double PRICE_BAG = 9.50;
        final double PRICE_BREAD = 1.23;
        final double TAX_RATE = 0.025;
        final double GREEN_DISCOUNT = .6;
        String menu_s, menuBook_s, numBook_s, numPen_s, numBag_s, numBread_s, choice;
        int menu, menuBook, numBook, numPen, numBag, numBread;
        double cost;
        boolean flag = true, flagBook = true;
        do {
            menu_s = JOptionPane.showInputDialog(null, "Welcome to Ye Olde University Shoppe!\n"
                    + "Please browse our wares."
                    + "1. Book\n"
                    + "2. Pen\n"
                    + "3. Bag\n"
                    + "4. Bread");
            menu = Integer.parseInt(menu_s);

            if (menu == 1) {
                do {
                    menuBook_s = JOptionPane.showInputDialog(null, "1. eBook\n2. Hard Copy");
                    menuBook = Integer.parseInt(menuBook_s);
                    if (menuBook == 1) {
                        numBook_s = JOptionPane.showInputDialog(null, "How many eBooks do you wish to purchase?");
                        numBook = Integer.parseInt(numBook_s);
                    } else if (menuBook == 2) {
                        numBook_s = JOptionPane.showInputDialog(null, "How many Dead Tree Editions do you wish to purchase?");
                        numBook = Integer.parseInt(numBook_s);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Input.");
                    }
                    choice = JOptionPane.showInputDialog(null, "Do you wish to purchase more books?");
                    if (choice.equals("n") || choice.equals("no") || choice.equals("false")
                            || choice.equals("f") || choice.equals("0")) {
                        flagBook = false;
                    } else if (choice.equals("y") || choice.equals("yes") || choice.equals("true")
                            || choice.equals("t")) {
                        flagBook = true;
                    }
                } while (flagBook);

            } else if (menu == 2) {

            } else if (menu == 3) {

            } else if (menu == 4) {

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.");
            }
        } while (flag);

    }
}