import java.util.Arrays;
import java.util.Map;

public class StoreController {
    Inventory inventory = new Inventory();
    StoreController() {
        String[][] items;

    }
    String[][] getItems() {
        System.out.println("Size of items: "+inventory.items.size());
        String[][] items = new String[inventory.items.size()][3];
        int i=0;
        for (Map.Entry<Item, Integer> entry : inventory.items.entrySet()) {
            Item item = entry.getKey();
            String[] itemArray = {item.description, item.price.toString(), item.itemID};
            System.out.println(i+" "+ items.length);
            items[i] = itemArray;
            System.out.println(i+" "+ Arrays.toString(itemArray));
            ++i;

        }
        return items;
    }
    void addItems(String desc, String price, String id, String quantity) {
        System.out.println("Requesting add item");
        inventory.addItem(desc, Float.parseFloat(price), id, Integer.parseInt(quantity));
    }
}
