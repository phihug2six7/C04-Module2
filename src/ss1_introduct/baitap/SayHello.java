package ss1_introduct.baitap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        System.out.println("Hello"+" "+name);
    }
}
