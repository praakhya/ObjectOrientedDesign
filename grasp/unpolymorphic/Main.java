package unpolymorphic;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Float a=10.0f,b=20.0f,c=15.0f;
        Triangle firstShape = new Triangle(a,b,c);
        Rectangle secondShape = new Rectangle(a,b);
        System.out.println(firstShape);
        System.out.println(secondShape);
    }
}
