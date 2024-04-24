package valid;

public class PaperbackBookInterface implements BookInterface{
    public void deliver() {
        System.out.println("Dispatched from warehouse. It will arrive soon at your address!");
    }
}
