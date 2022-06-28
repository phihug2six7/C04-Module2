package casestudy.controlller;

import java.util.Scanner;
public class FacilityManagement {
    public static void displayFacilityManagement(){
        boolean flag=true;
        do {


            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Hiện thị danh sách cơ sở" +
                    "\n 2.Thêm mới cơ sở " +
                    "\n 3.Hiện thị bảo trì cơ sở" +
                    "\n 4.Trở về menu chính");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            String choose = (scanner.nextLine());
            switch (choose) {
                case "1":
                    // code hiện thị danh sách cơ sở
                    break;

                case "2":
                    // code thêm mới chức năng cơ sở
                    break;

                case "3":
                    // code hiện thị chức năng bảo trì
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
