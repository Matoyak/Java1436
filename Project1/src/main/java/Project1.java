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
        final double GREEN_DISCOUNT = 0.6;
        String menu, menuBook, numBook_s, numPen_s, numBag_s, numBread_s, choiceBook;
        int numBookP = 0, numBookE = 0, numPen = 0, numBag = 0, numBread = 0;
        double total, subTotal, bookCost;
        boolean flag = true, flagBook = true, inputCheck;
        do {
            menu = JOptionPane.showInputDialog(null, "Welcome to Ye Olde University Shoppe!\n"
                    + "Please browse our wares."
                    + "1. Book\n"
                    + "2. Pen\n"
                    + "3. Bag\n"
                    + "4. Bread");
            switch (menu) {
                case "1":
                    do {
                        do {
                            inputCheck = true;
                            menuBook = JOptionPane.showInputDialog(null, "1. eBook\n2. Hard Copy");
                            switch (menuBook) {
                                case "1":
                                    numBook_s = JOptionPane.showInputDialog(null, "How many eBooks do you wish to purchase?");
                                    numBookE += Integer.parseInt(numBook_s);
                                    inputCheck = false;
                                break;
                                case "2":
                                    numBook_s = JOptionPane.showInputDialog(null, "How many Dead Tree Editions do you wish to purchase?");
                                    numBookP += Integer.parseInt(numBook_s);
                                    inputCheck = false;
                                break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Invalid Input.");
                                break;
                            }
                        } while (inputCheck);

                        do {
                            inputCheck = true;
                            choiceBook = JOptionPane.showInputDialog(null, "Do you wish to purchase more books?");
                            switch (choiceBook) {
                                case "n":
                                case "no":
                                case "false":
                                case "f":
                                case "0":
                                    flagBook = false;
                                    inputCheck = false;
                                break;
                                case "y":
                                case "yes":
                                case "true":
                                case "t":
                                    flagBook = true;
                                    inputCheck = false;
                                break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Invalid Input.");
                                break;
                            }
                        } while (inputCheck);
                    } while (flagBook);
                break;
                case "2":
                    numPen_s = JOptionPane.showInputDialog(null, "How many Dead Tree Editions do you wish to purchase?");
                    numPen += Integer.parseInt(numPen_s);
                    flag = false;
                break;
                case "3":
                    numBag_s = JOptionPane.showInputDialog(null, "How many Dead Tree Editions do you wish to purchase?");
                    numBag += Integer.parseInt(numBag_s);
                    flag = false;
                    break;
                case "4":
                    numBread_s = JOptionPane.showInputDialog(null, "How many Dead Tree Editions do you wish to purchase?");
                    numBread += Integer.parseInt(numBread_s);
                    flag = false;
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input. Please try again.");
                    flag = true;
                break;
            }
        } while (flag);

        bookCost = numBookE * (PRICE_BOOK - PRICE_BOOK * GREEN_DISCOUNT) + numBookP * PRICE_BOOK;
        subTotal = bookCost + numPen * PRICE_PEN + numBag * PRICE_BAG;
        subTotal *= TAX_RATE;
        total = subTotal + numBread * PRICE_BREAD;
        JOptionPane.showMessageDialog(null, String.format("The total cost of your order is $%1$3f", total));
    }
}
