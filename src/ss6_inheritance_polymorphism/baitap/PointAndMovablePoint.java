package ss6_inheritance_polymorphism.baitap;

public class PointAndMovablePoint {
    public static void main(String[] args) {
        Point point=new MovablePoint();
        MovablePoint movablePoint=(MovablePoint) point;

        movablePoint.setXY(1,2);
        movablePoint.setSpeed(1,2);

        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
