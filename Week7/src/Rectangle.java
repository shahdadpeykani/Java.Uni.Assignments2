public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculateVolume(boolean b){
        if(b){
            return length*width*length;
        }else{
            return Math.pow(width,3);
        }
    }
}
