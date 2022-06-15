package ss7_abstract_class_and_interface.baitap.baitap1;

public class MainShape {
    public static void main(String[] args) {
        double percent =Math.floor(Math.random()*100+1)/100;
      Shape[] shape=new Shape[3];
      shape[0]=new Circle(3);
      shape[1]=new Rectangle(2,2);
      shape[2]=new Square(2,2);

        System.out.println("Trước khi thay đổi");
        for (Shape s:shape) {
            System.out.println(s);
        }
        System.out.println("Sau khi thay đổi");
        for (Shape s:shape) {
           s.resize(percent);
            System.out.println(s);
        }
    }
}


