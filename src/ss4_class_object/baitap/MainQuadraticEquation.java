package ss4_class_object.baitap;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số a");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số b");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số c");
        double c=Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
    }
}
