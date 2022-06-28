package casestudy.controlller;

import java.util.Scanner;

public class BookingManagement {
    public static void displayBookingManagement() {
        System.out.println("Chức năng của hệ thống " +
                "\n 1.Thêm mới đặt trước" +
                "\n 2.Hiện thị danh sách đặt phòng" +
                "\n 3.Tạo mới hợp đồng" +
                "\n 4.Hiện thị danh sách hợp đồng" +
                "\n 5.Chỉnh sửa hợp đồng" +
                "\n 6.Quay về menu chính");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn chức năng");
        String choose = (scanner.nextLine());
        switch (choose) {
            case "1":
                // code thêm mới đặt phòng

                break;
            case "2":
                // code hiện thị danh sách đặt phòng

                break;
            case "3":
                // code tạo mới hợp đồng

                break;
            case "4":
                // code hiện thị danh sách hợp đồng

                break;
            case "5":
                // code sửa danh sách hợp đồng

                break;
            case "6":
                // quay lại menu chính
                break;

            default:
                System.out.println("bạn nhập chưa đúng");

        }
    }
}
