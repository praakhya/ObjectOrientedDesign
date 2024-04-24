package valid;

public class Sphere implements Shape3D {
    Double radius;
    public Double getArea() {
        Double area = 4*Math.PI*Math.pow(radius,2);
        return area;
    }
    public Double getVolume() {
        Double volume = (4/3)*Math.PI*Math.pow(radius,3);
        return volume;
    }
}
