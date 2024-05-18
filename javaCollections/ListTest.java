import java.util.*;

public class ListTest {
    //size(), clear(), add(), Add(),addAll(),
    // contains(), containsAll(), equals(),
    // hashCode(), isEmpty(), indexOf().
    static void getSize(List<?> l) {
        System.out.printf("Size of %s: %d\n",l.getClass().getSimpleName(), l.size());
    }
    static void clear(List<?> l) {
        l.clear();
    }
    static void add(List<? super String> l) {
        int c;
        System.out.println("How many elements do you want to add? ");
        c = Integer.parseInt(scanner.nextLine());
        System.out.println("Start adding: -");
        for (int i=0; i<c; ++i) {
            l.add(scanner.nextLine());
        }
    }
    static void remove(List<?> l) {
        int c;
        System.out.println("Which element do you wish to remove?");
        l.remove(scanner.nextLine());
    }
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        List<String> l2 = new LinkedList<>();
        List<String> l3 = new Vector<>();
        List<String> l4 = new Stack<>();
        List<List<String>> allLists = new ArrayList<>(Arrays.asList(l1,l2,l3,l4));
        for (List<String> l:allLists) {
            getSize(l);
            add(l);
            getSize(l);
            System.out.println(l);
            remove(l);
            getSize(l);
            System.out.println(l);
        }

    }

}
