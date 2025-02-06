public class AnimalCalculator
{
    public static void printAnimals (ArrayList<Animal> animals)
    {
        for (Animal animal : animals)
        {
            System.out.println(animal.getName() + "legs:" animal.getLegCount() + (animal.isFurry() ? "furry" : "not furry")); 
        }
    }
    
    public static double averageLegs(ArrayList<Animal> animals)
    {
        int totalLegs = 0; 
        for (Animal animal : animals)
        {
            totalLegs += animal.getLegCount(); 
        }
        
        return (double) totalLegs / animals.size(); 
    }
    
    public static Animal fewestLegs(ArrayList<Animal> animals)
    {
        Animal minAnimal = animals.get(0);
        for (Animal animal : animals)
        {
             if (animal.getLegCount() < minAnimal.getLegCount()) {
                minAnimal = animal;
                
        }
        
        return minAmimal; 
    }
}