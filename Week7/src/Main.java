public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        Circle c = new Circle(7);
        ShapeCalculator calculator = new ShapeCalculator();
        double rectangleArea = calculator.calculateArea(r);
        System.out.println("The area of the rectangle is " + rectangleArea);
        double rectangleArea2 = calculator.calculateVolume(r,true);
        System.out.println("The volume of the rectangle is " + rectangleArea2);
        double rectangleArea3 = calculator.calculateVolume(r,false);
        System.out.println("The volume of the not rectangle is " + rectangleArea3);
        double circleArea = calculator.calculateArea(c);
        System.out.println("The area of the circle is " + circleArea);
        double circleArea2 = calculator.calculateVolume(c);
        System.out.println("The volume of the circle is " + circleArea2);
    }
}