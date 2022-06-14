package ss5_accessmodifier_static_method_static_property.thuchanh;

import java.util.Scanner;

public class HotelManager {
    Scanner scanner = new Scanner(System.in);
    static Hotel[] hotels = new Hotel[100];

    static {
        hotels[0] = new Hotel(1, "standard", 500000);
        hotels[1] = new Hotel(2, "deluxe", 1000000);
        hotels[2] = new Hotel(3, "king", 2000000);
    }

    public void display() {
        for (Hotel s : hotels)
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
    }

    public void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại phòng");
        String roomtype=scanner.nextLine();
        System.out.println("Nhập giá phòng");
        double price=Double.parseDouble(scanner.nextLine());

    }
}