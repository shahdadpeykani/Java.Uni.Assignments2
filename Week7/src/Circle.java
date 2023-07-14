public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double calculateVolume(){
        return Math.pow(radius,3);
    }
}
