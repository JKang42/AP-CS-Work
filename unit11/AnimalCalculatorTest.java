import java.util.ArrayList;

public class AnimalCalculatorTest {
    
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Human());
        animals.add(new Cat());
        animals.add(new Sponge());
        animals.add(new Centipede());

        System.out.println("Animal List:");
        AnimalCalculator.printAnimals(animals);

        double avgLegs = AnimalCalculator.averageLegs(animals);
        System.out.println("\nAverage number of legs: " + avgLegs);
        assert avgLegs == (2 + 4 + 0 + 100) / 4.0 : "Average leg calculation failed";

        // Test fewestLegs function
        Animal minLegsAnimal = AnimalCalculator.fewestLegs(animals);
        System.out.println("\nAnimal with fewest legs: " + minLegsAnimal.getName());
        assert minLegsAnimal.getName().equals("Sponge") : "Fewest legs calculation failed";
    
        
        
    }
}
