package ss2_loop.baitap;

import java.util.Scanner;

public class MenuFor {
    public static void main(String[] args) {
        display();
    }
    public static void display() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Menu:" +
                "\n 1.Print the rectangle" +
                "\n 2.Print the square triangle(The corner is square at 4 different angles:top-left,top-right,botton-left,botton-right)" +
                "\n 3.Print isosceles triangle" +
                "\n 4.Exit");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                for (int i = 0; i <3 ; i++) {
                    for (int j = 0; j <5 ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <=6 ; i++) {
                    for (int j = 1; j <i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 5; i >=0 ; i--) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 5; i >=1 ; i--) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("");
        }
    }
}
