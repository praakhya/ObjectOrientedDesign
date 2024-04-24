package unpolymorphic;

public class Triangle {
    Float a,b,c;
    Triangle(Float a, Float b, Float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Float getPerimeter() {
        return this.a + this.b + this.c;
    }
    Float getArea() {
        Float s = (this.a + this.b + this.c)/2;
        Double area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        return area.floatValue();
    }
    public String toString() {
        return String.format("Triangle(a=%f, b=%f, c=%f) : area=%f, perimeter=%f",a,b,c,getArea(),getPerimeter());
    }
}
