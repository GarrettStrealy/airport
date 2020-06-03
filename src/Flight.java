/**
 * @author garrettstrealy
 */

public class Flight {
    private Plane plane;
    private String departureCode;
    private String destinationCode;

    public Flight (Plane plane, String departureCode, String destinationCode) {
        this.plane = plane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    @Override

    public String toString() {
        return this.plane.getName() + " (" + this.plane.getCapacity() +
                " ppl) (" + this.departureCode + "-" + this.destinationCode + ")";

    }
}
