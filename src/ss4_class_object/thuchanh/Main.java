package ss4_class_object.thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều dài ");
        double width=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao ");
        double height=Double.parseDouble(scanner.nextLine());
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Area "+rectangle.getArea());
        System.out.println("Perimeter "+rectangle.getPerimeter());
        System.out.println("Your Rectangle "+rectangle.diplay());
    }
}
