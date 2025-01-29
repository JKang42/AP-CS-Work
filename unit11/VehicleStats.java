import java.util.*;

public class VehicleStats {

    public static int totalWheels(ArrayList<Vehicle> vehicles) {
        int total = 0;
        for (Vehicle v : vehicles) {
            total += v.wheelCount();
        }
        return total;
    }

    public static ArrayList<Vehicle> humanPoweredVehicles(ArrayList<Vehicle> vehicles) {
        ArrayList<Vehicle> humanPowered = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.isHumanPowered()) {
                humanPowered.add(v);
            }
        }
        return humanPowered;
    }
}
