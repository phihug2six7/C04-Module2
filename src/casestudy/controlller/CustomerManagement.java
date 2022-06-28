package casestudy.controlller;

import java.util.Scanner;

public class CustomerManagement {
    public static void displayCustomerManagement(){
        boolean flag=true;
        do {


            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Hiện thị danh sách khách hàng" +
                    "\n 2.Thêm mới khách hàng" +
                    "\n 3.Sửa khách hàng" +
                    "\n 4.Quay về menu chính");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            String choose = (scanner.nextLine());
            switch (choose) {
                case "1":
                    // code hiện thị ds khách hàng

                    break;
                case "2":
                    // code thêm mới khách hàng

                    break;
                case "3":
                    // code sửa thông tin khách hàng

                    break;

                case "4":
                    // quay lại menu chính
                    break;

                default:
                    System.out.println("bạn nhập chưa đúng");

            }
        }while (flag);
    }
}
