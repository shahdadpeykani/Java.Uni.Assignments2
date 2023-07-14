public class ShapeCalculator {
    public double calculateArea(Rectangle r){
        return r.calculateArea();
    }
    public double calculateArea(Circle c){
        return c.calculateArea();
    }
    public double calculateVolume(Circle c){
        return c.calculateVolume();
    }
    public double calculateVolume(Rectangle r,boolean b){
        return r.calculateVolume(b);
    }
}
