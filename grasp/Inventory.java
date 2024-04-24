import java.util.HashMap;
import java.util.Map;

public class Inventory { //This class has responsibility of a creator
    Map<Item, Integer> items; //It contains the items
    Inventory() {
        items = new HashMap<>();
    }
    void addItem(String description, double price, String itemID, int quantity) {
        Item newItem = new Item(
                description, price, itemID //It initialises data for each item
        );
        items.put(newItem, quantity);
    }
}
