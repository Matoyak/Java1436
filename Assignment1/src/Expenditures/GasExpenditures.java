package Expenditures;

import java.util.Scanner;

/**
 * Created by Matoyak on 6/9/2015.
 */
public class GasExpenditures {


    public static void main(String[] args) {
        int tripsPerMonth;
        double distancePerTrip, distancePerYear, costPerFill, costPerMonth;

        //Call for input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many kilometers away is the nearest gas station? ");
        distancePerTrip = keyboard.nextDouble();
        System.out.print("How much does it cost to fill up the vehicle? ");
        costPerFill = keyboard.nextDouble();
        System.out.print("How many times do you have to fill up in one month? ");
        tripsPerMonth = keyboard.nextInt();

        //Calculations
        costPerMonth = tripsPerMonth * costPerFill;
        distancePerYear = 2 * distancePerTrip * tripsPerMonth * 12;

        //Basic Output
        Output(costPerMonth, distancePerTrip, distancePerYear);
    }

    public static void Output(double cost, double distTrip, double distYr) {
        System.out.println("The round-trip distance is: " + (2 * distTrip) + "km");
        System.out.format("The monthly cost is: $%f%n", cost);
        System.out.println("The total mileage per year is: " + distYr + "km");
    }
}
