import java.util.List;

public class HighCouplingCart {
    List<Item> addedItems; //The cart is related to entire items even though it may not need all information about an item.
    void addToCart(Item item) {
        addedItems.add(item);
    }
    void removeFromCart(Item item) {
        addedItems.remove(item);
    }
}
