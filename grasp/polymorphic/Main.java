package polymorphic;

import polymorphic.Rectangle;
import polymorphic.Triangle;

public class Main {
    public static void main(String[] args) {
        Float a=10.0f,b=20.0f,c=15.0f;
        Shape shape = new Triangle(a,b,c);
        System.out.println(shape);
        shape = new Rectangle(a,b);
        System.out.println(shape);
    }
}
