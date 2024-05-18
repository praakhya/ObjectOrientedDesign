import java.util.Arrays;

public class Buddy implements Cloneable{
    private final String name;
    private final int[] array;
    Buddy(String name) {
        this.name = name;
        this.array = new int[10];
        this.array[0] = 20;
        this.array[1] = 10;
    }
    Buddy(Buddy buddy) {
        this.name = buddy.name;
        this.array = buddy.array;
    }
    Buddy(String name, int[] array) {
        this.name = name;
        this.array = array;
    }

    void sayHello(){
        System.out.printf("Hi! nice to meet you. I am %s :",this.name);
        Arrays.stream(this.array).asLongStream().forEach( i -> System.out.printf("%d ", i));
        System.out.println();
    }
    void sayBye(){
        System.out.println("Bye! see you next time");
    }

    @Override
    public Buddy clone() throws CloneNotSupportedException {
        return new Buddy(this.name, this.array.clone());
    }

    public void changeArrayValues() {
        this.array[0] = 30;
        this.array[1] = 40;
    }

/*
    @Override
    protected Buddy clone() {
        return new Buddy(this.name);
    }
*/

}
