package ss17_binaryfile_serialization.bai1.controller;

import ss17_binaryfile_serialization.bai1.service.IService;
import ss17_binaryfile_serialization.bai1.service.ipml.ProductService;

import java.util.Scanner;

public class ProductController {

    public static void displayMainMenu() {
        IService service = new ProductService();
        ProductService productService=new ProductService();
        String choose = "";
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Thêm" +
                    "\n 2.Hiện thị" +
                    "\n 3.Tìm kiếm thông tin hiển thị " +
                    "\n 4.Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            choose = (scanner.nextLine());
            switch (choose) {
                case "1":
                    // thêm
//                    service.them();
                    productService.them();
                    break;
                case "2":
                    // hiện thị
//                    service.hienThi();
                    productService.hienThi();
                    break;
                case "3":
                    // tìm kiếm
//                    service.timKiem();
                    productService.timKiem();
                    break;
                case "4":
                    //thoát khỏi chương trình
                    break;
                default:
                    System.out.println("bạn nhập chưa đúng");
            }
        } while (!choose.equals("4"));
    }
}
