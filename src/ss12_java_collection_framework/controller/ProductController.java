package ss12_java_collection_framework.controller;

import javafx.scene.transform.Scale;
import ss12_java_collection_framework.service.ProductManager;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner=new Scanner(System.in);

    public static void displayMenu(){
        ProductManager productManager=new ProductManager();
        String selection = "";
        do {
            System.out.println("Ứng dụng quản lý sản phẩm:"+
                            "\n1. Thêm mới sản phẩm." +
                            "\n2. Sửa sản phẩm." +
                            "\n3. Xóa sản phẩm." +
                            "\n4. Hiện thị danh sách sản phẩm." +
                            "\n5. Tìm kiếm sản phẩm." +
                            "\n6. Sắp xếp sản phẩm." +
                            "\n7. Thoát khỏi chương trình." );

            System.out.println("Chọn chức năng.");

            selection=scanner.nextLine();

            switch (selection){
                case "1":
                    productManager.addProduct();
                    break;
                case "2":
                    productManager.editProduct();
                    break;
                case "3":
                    productManager.removeProduct();
                    break;
                case "4":
                    productManager.displayProduct();
                    break;
                case "5":
                    productManager.searchProduct();
                    break;
                case "6":
                    productManager.sortProduct();
                    break;
                case "7":
                    System.out.println("Thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Bạn nhập chưa đúng hãy nhập lại.");

            }
        }while (!selection.equals("7"));
    }
}
