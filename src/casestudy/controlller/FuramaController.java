package casestudy.controlller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        boolean flag =true;
        String choose="";
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Employee Management" +
                    "\n 2.Customer Management" +
                    "\n 3.Facility Management " +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit") ;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
             choose = (scanner.nextLine());
            switch (choose){
                case "1":
                    // code display nhân viên
                    EmployeeManagement.displayEmployManagement();

                    break;
                case "2":
                    // code display khách
                    CustomerManagement.displayCustomerManagement();
                    break;
                case "3":
                    // code display chức năng của hệ thống ks
                    FacilityManagement.displayFacilityManagement();
                   break;
                case "4":
                    // code đặt phòng và tạo họp đồng
                    BookingManagement.displayBookingManagement();
                    break;
                case "5":
                    // code khuyến mãi
                    PromotionManagement.displayPromotionManager();
                case "6":
                    System.out.println("thoát khỏi ctr");
                    break;
                default:
                    System.out.println("bạn nhập chưa đúng");
            }
        }while (!choose.equals("6"));
    }
}
