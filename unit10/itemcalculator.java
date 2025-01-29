import java.util.*;

public class itemcalculator {

    public static void printItem(ArrayList<Item> items) {
        for (Item i : items) {
            System.out.println(i.getName() + " costs " + i.getPrice());
        }
    }

    public static double averagePrice(ArrayList<Item> items) {
        double sum = 0;

        for (Item i : items) {
            sum += i.getPrice(); 
        }

        return sum / items.size();  
    }

    public static String mostExpensiveItem(ArrayList<Item> items) {
        if (items.isEmpty()) {
            return null; 
        }

        Item mostExpensive = items.get(0); // Initial assumption: first item is the most expensive

        for (Item i : items) {
            if (i.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = i;  // Update if a more expensive item is found
            }
        }

        return mostExpensive.getName();  
    }

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        // Adding items
        items.add(new Item("Blu-ray", 86));
        items.add(new Item("Television", 190));
        items.add(new Item("Playlist CD", 67));
        items.add(new Item("Photobook", 200));
        items.add(new Item("Poster", 34));

        // Printing the list of items
        printItem(items);

        // Printing the average price
        System.out.println("Average price: ");
        System.out.println(averagePrice(items));

        // Printing the most expensive item
        System.out.println("Most expensive item: ");
        System.out.println(mostExpensiveItem(items));
    }
}

    

