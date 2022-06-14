package ss6_inheritance_polymorphism.baitap;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle=new Circle(2.0,"white");
        System.out.println(circle);
        Cylinder cylinder=new Cylinder(2.0,"black",3.0);
        System.out.println(cylinder);
    }
}
