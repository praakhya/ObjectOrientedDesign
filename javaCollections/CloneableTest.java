import java.util.Collection;
import java.util.List;

public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Buddy myBuddy = new Buddy("Buddy a");
        myBuddy.sayHello();
        myBuddy.sayBye();
        Buddy myBuddyClone = myBuddy.clone();
        myBuddyClone.sayHello();
        myBuddyClone.sayBye();
        myBuddy.changeArrayValues();
        myBuddy.sayHello();
        myBuddyClone.sayHello();

    }
}