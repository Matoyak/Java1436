package Project2;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Project2 of Project2
 * Created by Mason Matlock on 6/29/2015.
 */
public class Driver {
    public static void main(String[] args) throws IOException {
        String num_s;
        String inFile = "C:\\Users\\Mason Worrell\\Documents\\GitHub\\Java1436\\Project2\\src\\main\\resources\\transaction.dat";
        String outFile = "weeklyReport.dat";

        ArrayList<String> withdrawals_s = new ArrayList<>();
        ArrayList<Double> withdrawals = new ArrayList<>();
        CheckingAccount mason = new CheckingAccount();
        mason.setAccountName("Mason Matlock");

        FileReader fReader = new FileReader(inFile);
        BufferedReader bReader = new BufferedReader(fReader);

        FileWriter fWriter = new FileWriter(outFile);
        PrintWriter pWriter = new PrintWriter(fWriter);

        do {
            num_s = bReader.readLine();
            withdrawals_s.add(num_s);
        } while (num_s != null);

        for (String withdrawals_ : withdrawals_s) {
            if (withdrawals_ != null) {
                withdrawals.add(Double.parseDouble(withdrawals_));
            } else {
                break;
            }
        }

        for (Double withdrawal : withdrawals) {
            mason.withdraw(withdrawal);
        }

        pWriter.println("The final balance for " + mason.getAccountName() + " is $" + mason.getBalance());

        if (mason.getBalance() < 0) {
            pWriter.println("There will be a " + mason.getPenalty() * 100 + " percent penalty for over-withdrawal.");
        } else if (mason.getBalance() > 10) {
            pWriter.println("There will be a " + mason.getInterest() * 100 + " percent increase due to interest.");
            mason.setBalance(mason.getBalance() * (1 + mason.getInterest()));
        }

        bReader.close();
        pWriter.close();
    }
}
