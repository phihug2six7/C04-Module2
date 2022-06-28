package mvc.controller;

import java.util.Scanner;

public class StudentController {
    public static void displayMenuStudent(){

            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Thêm học sinh" +
                    "\n 2.Hiển thị học sinh" +
                    "\n 3.Sửa" +
                    "\n 4.Xóa" +
                    "\n 5.Search" +
                    "\n 6.Menu chính") ;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // code thêm
                    System.out.println("chức năng thêm");

                    break;
                case 2:
                    // code hiện thị
                    System.out.println("Chức năng hiện thị");
                    break;
                case 3:
                    // code sửa
                    System.out.println("sửa");
                    break;
                case 4:
                    // code xóa
                    System.out.println("xóa");
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("tìm");
                    break;
                case 6:
                    // quay lại menu chính
                    break;

                default:
                    System.out.println("bạn nhập chưa đúng");

            }
    }
}


