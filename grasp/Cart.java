import java.util.List;

public class Cart {
    List<String> addedItems; //Coupling between Cart and Item class is reduced by only storing the id of items.
    void addToCart(String id) {
        addedItems.add(id);
    }
    void removeFromCart(String id) {
        addedItems.remove(id);
    }
}
