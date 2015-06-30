package Project2;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Project2 of Project2
 * Created by Mason Matlock on 6/29/2015.
 */
public class Driver {
    public static void main(String[] args) throws IOException {
        String inFile = "transaction.dat";
        String outFile = "weeklyReport.dat";

        CheckingAccount mason = new CheckingAccount();

        FileReader fReader = new FileReader(inFile);
        BufferedReader buffReader = new BufferedReader(fReader);

        FileWriter fWriter = new FileWriter(outFile);
        PrintWriter outputFile = new PrintWriter(fWriter);

        mason.setBalance(200);
    }
}
