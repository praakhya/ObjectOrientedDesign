package invalid;

public class Circle implements Shape{
    Double radius;
    public Double getArea() {
        Double area = 4*Math.PI*Math.pow(radius,2);
        return area;
    }
    public Double getPerimeter() {
        //? Cannot find perimeter of a 3D figure ?
        return null;
    }
    public Double getVolume() {
        Double volume = (4/3)*Math.PI*Math.pow(radius,3);
        return volume;
    }
}
