package valid;

public class Triangle implements Shape2D {
    Double s1, s2, s3;
    public Double getArea() {
        Double s = (s1+s2+s3)/2;
        Double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return area;
    }
    public Double getPerimeter() {
        return s1+s2+s3;
    }

}
