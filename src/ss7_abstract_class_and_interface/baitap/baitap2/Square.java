package ss7_abstract_class_and_interface.baitap.baitap2;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side,  String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }


    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    public void howtoColor() {
        System.out.println("Color all four side");
    }

    @Override
    public String toString() {
        return this.getSide()+super.toString();
    }


}
