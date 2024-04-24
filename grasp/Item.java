import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //Generates a constructor with all arguments
public class Item { //This is the class that the creator creates objects of
    final String description;
    final Double price;
    final String itemID;
}
