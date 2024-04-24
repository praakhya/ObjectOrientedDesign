import java.util.HashMap;
import java.util.Map;

public class Inventory { //This class is the information expert
    Map<Item, Integer> items; //It contains the items
    Inventory() {
        items = new HashMap<>();
    }
    void addItem(String description, double price, String itemID, int quantity) {
        Item newItem = new Item(
                description, price, itemID //It initialises data for each item (creator)
        );
        items.put(newItem, quantity);
    }
    int getNumberOfItems() {
        //The information expert has information about all items and can return count of items
        int sum=0;
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            sum+=entry.getValue();
        }
        return sum;
    }
}
