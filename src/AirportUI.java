/**
  @author garrettstrealy
 */

import java.util.*;


public class AirportUI {
    private Scanner reader;
    private HashMap<String, Plane> planes;
    private HashMap<Plane, Flight> flights;

    public AirportUI (Scanner reader) {
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
        this.reader = reader;
    }

        public void airportPanel() {

            System.out.println("Airport Panel\n"
                    + "--------------------\n");

            panelOptions();
        }


            private void panelOptions() {
                panel:
                while (true) {
                    System.out.print("Choose operation:\n"
                            + "[1] Add airplane\n"
                            + "[2] Add flight\n"
                            + "[x] Exit\n"
                            + "> ");

                    String command = reader.nextLine();

                    switch (command) {
                        case "x":
                            break panel;
                        case "1":
                            addPlane();
                            break;
                        case "2":
                            addFlight();
                            break;
                    }
                }
            }

                private void addPlane() {
                    System.out.print("Give plane ID: ");
                    String id = reader.nextLine();
                    System.out.print("Give plane capacity: ");
                    int capacity = Integer.parseInt(reader.nextLine());

                    this.planes.put(id, new Plane(id, capacity));
                }

                private void addFlight() {
                    System.out.print("Give plane ID: ");
                    String planeId = reader.nextLine();
                    System.out.print("Give departure airport code: ");
                    String departureCode = reader.nextLine();
                    System.out.print("Give destination airport code: ");
                    String destinationCode = reader.nextLine();

                    // Create a new key every time to avoid replacement of duplicates
                    for (Plane plane : planes.values()) {
                        if (plane.getName().equals(planeId)) {
                            Plane newPlane = new Plane(plane.getName(), plane.getCapacity());
                            flights.put(newPlane, new Flight(newPlane, departureCode, destinationCode));
                        }
                    }
                }

        public void flightService() {
            System.out.println("\nFlight service" +
                    "\n------------");
            serviceOptions();
        }

            private void serviceOptions() {

                service:
                while (true) {
                    System.out.print("\nChoose operation:\n"
                            + "[1] Print planes\n"
                            + "[2] Print flights\n"
                            + "[3] Print plane info\n"
                            + "[x] Quit\n"
                            + "> ");

                    String command = reader.nextLine();

                    switch (command) {
                        case "x":
                            break service;
                        case "1":
                            printPlanes();
                            break;
                        case "2":
                            printFlights();
                            break;
                        case "3":
                            printPlaneInfo();
                            break;
                    }
                }
            }

                private void printPlanes() {
                    for ( Plane plane : planes.values() ) {
                        System.out.println( plane );
                    }
                }

                private void printFlights() {
                    for ( Flight flight : flights.values() ) {
                        System.out.println(flight);
                    }
                }

                private void printPlaneInfo() {
                    System.out.print("Give plane ID: ");
                    String planeId = reader.nextLine();

                    System.out.println( planes.get(planeId) );
                }
}

