package casestudy.controlller;

import java.util.Scanner;

public class EmployeeManagement {
    public static void displayEmployManagement() {
        boolean flag=true;
        do {


            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Hiện thị danh sách nhân viên" +
                    "\n 2.Thêm mới nhân viên" +
                    "\n 3.Sửa nhân viên" +
                    "\n 4.Menu chính");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            String choose = (scanner.nextLine());
            switch (choose) {
                case "1":
                    // code hiện thị ds nhân viên
                    break;

                case "2":
                    // code thêm mới nhân viên

                    break;

                case "3":
                    // code sửa nhân viên

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
