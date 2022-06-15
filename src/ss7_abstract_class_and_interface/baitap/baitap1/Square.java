package ss7_abstract_class_and_interface.baitap.baitap1;

import ss7_abstract_class_and_interface.baitap.baitap1.Rectangle;
import ss7_abstract_class_and_interface.baitap.baitap1.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();
//                + ", which is a subclass of "
//                + super.toString();
    }

//    @Override
//    public void resize(double percent) {
////        super.resize(percent);
//        setSide(getSide()+getSide()*percent);
//    }
}

