package ss15_exception_debug.baitap;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c");
        int c = Integer.parseInt(scanner.nextLine());
        Triangle triangle = new Triangle();

        try {
            triangle = new Triangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
