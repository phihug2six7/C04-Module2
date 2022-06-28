package casestudy.controlller;

import java.util.Scanner;

public class PromotionManagement {

        public static void displayPromotionManager () {
            boolean flag = true;
            do {
                System.out.println("Chức năng của hệ thống " +
                        "\n 1.Hiện thị danh sách khách hàng sử dụng dịch vụ" +
                        "\n 2.Hiện thị danh sách khách hàng nhận khuyến mãi " +
                        "\n 3.Trở về menu chính");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Chọn chức năng");
                String choose = (scanner.nextLine());
                switch (choose) {
                    case "1":
                        // code hiện thị danh sách khách hàng sử dụng dịch vụ
                        break;

                    case "2":
                        // code hiện thị danh sách khách hàng nhận khuyến mãi
                        break;

                    case "3":
                        // quay lại menu chính
                        break;

                    default:
                        System.out.println("bạn nhập chưa đúng");
                }
                }while (flag);
            }
    }

