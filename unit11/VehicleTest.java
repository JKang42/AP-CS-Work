import java.util.*;


public class VehicleTest
{
    public static void main(String[] args)
    {
        System.out.println("Vehicle Test");

        ArrayList<Vehicle> vehicles = new ArrayList<Shape>();
        vehicles.add(new Car(1, 2));
        vehicles.add(new Motorcycle(3, 4));
        vehicles.add(new Bicycle(6, 14));
        vehicles.add(new Unicycle(1));

        for (Vehicle v : vehicles)
        {
            System.out.println(v.getName() + " has " + v.wheelCount() + 
                    " wheels and is " + (v.isHumanPowered() ? "human powered" : "not human powered"));
        }


    }
}
