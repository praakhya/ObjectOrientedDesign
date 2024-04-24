package polymorphic;

public class Rectangle extends Shape {
    Float a,b;
    Rectangle(Float a, Float b) {
        this.a = a;
        this.b = b;
    }
    public Float getPerimeter() {
        return 2*(this.a + this.b);
    }
    public Float getArea() {
        return this.a*this.b;
    }
    public String toString() {
        return String.format("Rectangle(a=%f, b=%f) : area=%f, perimeter=%f",a,b,getArea(),getPerimeter());
    }
}
