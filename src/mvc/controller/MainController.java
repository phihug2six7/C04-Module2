package mvc.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Quản lý học sinh" +
                    "\n 2. Quản lý giáo viên" +
                    "\n 3.Exit") ;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code display
                    StudentController.displayMenuStudent();

                    break;
                case 2:
                    // code thêm mới
                    System.out.println("Chức năng thêm ới");
                    break;
                case 3:
                    // code xóa
                    flag=false;
                    break;

                default:
                    System.out.println("bạn nhập chưa đúng");
            }
        }while (flag);
    }
}
