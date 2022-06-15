package ss7_abstract_class_and_interface.baitap.baitap2;

public class TestAll {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Square(4);
        shapes[1]=new Rectangle(2,3);
        shapes[2]=new Circle(3);
        for (Shape s:shapes) {
            System.out.println(s.getArea());
            if (s instanceof Square){
                 ((Square) s).howtoColor();
            }
        }
    }
}
