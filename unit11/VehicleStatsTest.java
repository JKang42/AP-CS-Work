import java.util.*;

public class VehicleStatsTest {
    public static void main(String[] args) {
        
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());

        
        System.out.println("Total number of wheels: ");
        System.out.println(VehicleStats.totalWheels(vehicles));

        ArrayList<Vehicle> humanPowered = VehicleStats.humanPoweredVehicles(vehicles);
        System.out.println("Human-powered vehicles:");
        for (Vehicle v : humanPowered) {
            System.out.println(v.name());
        }
    }
}
