package Expenditures;

import java.util.Scanner;

/**
 * Created by Matoyak on 6/9/2015.
 */
public class GasExpenditures {
    public static void main(String[] args) {
        int tripsPerMonth = -9;
        double distancePerTrip = -9.99;
        double distancePerYear = -9.99;
        double costPerFill = -9.99;
        double costPerMonth = -9.99;

        //Call for input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many kilometers away is the nearest gas station? ");
        distancePerTrip = keyboard.nextDouble();
        System.out.print("How much does it cost to fill up the vehicle? ");
        costPerFill = keyboard.nextDouble();
        System.out.print("How many times do you have to fill up in one month? ");
        tripsPerMonth = keyboard.nextInt();

        //Calculate junk
        costPerMonth = tripsPerMonth * costPerFill;
        distancePerYear = 2 * distancePerTrip * tripsPerMonth * 12;

        //Basic Output
        System.out.println("The round-trip distance is: " + (2 * distancePerTrip) + "km");
        System.out.println("The monthly cost is: $" + costPerMonth);
        System.out.println("The total mileage per year is: " + distancePerYear + "km");
    }
}
