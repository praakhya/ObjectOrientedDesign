package unpolymorphic;

public class Rectangle {
    Float a,b;
    Rectangle(Float a, Float b) {
        this.a = a;
        this.b = b;
    }
    Float getPerimeter() {
        return 2*(this.a + this.b);
    }
    Float getArea() {
        return this.a*this.b;
    }
    public String toString() {
        return String.format("Rectangle(a=%f, b=%f) : area=%f, perimeter=%f",a,b,getArea(),getPerimeter());
    }
}
