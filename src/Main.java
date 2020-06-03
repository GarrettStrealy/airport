/**
 * @author garrettstrealy
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        AirportUI airport = new AirportUI(reader);

        airport.airportPanel();
        airport.flightService();
    }

}
