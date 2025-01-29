import java.util.*;

public class PersonStats {
    
    public static void printPerson(ArrayList<Person> people) {
        for (Person p : people) {
            System.out.println(p.getName() + " has " + p.getpetnum() + " pets.");
        }
    }
   
    public static double averagePets(ArrayList<Person> people) {
        double totalPets = 0;

        for (Person p : people) {
            totalPets += p.getpetnum();  
        }

        return totalPets / people.size();  
    }

    public static String mostPets(ArrayList<Person> people) {

        Person personWithMostPets = people.get(0);

        for (Person p : people) {
            if (p.getpetnum() > personWithMostPets.getpetnum()) {  
                personWithMostPets = p;
            }
        }

        return personWithMostPets.getName();  
    }

   
    public static ArrayList<Person> peopleWithAtLeastTwoPets(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getpetnum() >= 2) {  
                result.add(p);  
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Emily", 3));
        people.add(new Person("Mina", 1));
        people.add(new Person("Rose", 5));
        people.add(new Person("Crystal", 0));
        people.add(new Person("Leila", 2));

        printPerson(people); 

        System.out.println("Average number of pets: ");
        System.out.println(PersonStats.averagePets(people));

        System.out.println("Person with the most pets: ");
        System.out.println(PersonStats.mostPets(people));

        ArrayList<Person> peopleWithAtLeastTwoPets = PersonStats.peopleWithAtLeastTwoPets(people);
        System.out.println("People with at least 2 pets:");
        for (Person p : peopleWithAtLeastTwoPets) {
            System.out.println(p.getName());
        }
    }
}
